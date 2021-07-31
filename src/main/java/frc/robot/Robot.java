// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

//import edu.wpi.first.wpilibj.AnalogGyro;//futuro giroscopio

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.subsystems.DriveTrain;
import edu.wpi.first.wpiutil.math.numbers. 

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  public static DriveTrain drivertrain = new DriveTrain();
  public static OI m_oi;

 

  /**
   * 
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  private double startTime;
  @Override
  public void robotInit() {
    m_oi = new OI();
   
  }

  /**
   * This function is called every robot packet, no matter the mode. Use this for items like
   * diagnostics that you want ran during disabled, autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before LiveWindow and
   * SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {}

  /**
   * This function is called once each time the robot enters Disabled mode. You can use it to reset
   * any subsystem information you want to clear when the robot is disabled.
   */
  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  /**
   * This autonomous (along with the chooser code above) shows how to select between different
   * autonomous modes using the dashboard. The sendable chooser code works with the Java
   * SmartDashboard. If you prefer the LabVIEW Dashboard, remove all of the chooser code and
   * uncomment the getString code to get the auto name from the text box below the Gyro
   *
   * <p>You can add additional auto modes by adding additional commands to the chooser code above
   * (like the commented example) or additional comparisons to the switch structure below with
   * additional strings & commands.
   */
  @Override
  public void autonomousInit() {
    startTime = Timer.getFPGATimestamp();

    

    /*
     * String autoSelected = SmartDashboard.getString("Auto Selector",
     * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
     * = new MyAutoCommand(); break; case "Default Auto": default:
     * autonomousCommand = new ExampleCommand(); break; }
     */

    // schedule the autonomous command (example)
    
    }
  

  /** This function is called periodically during autonomous. */
  @Override
  public void autonomousPeriodic() {

    double time = Timer.getFPGATimestamp();
    if (time - startTime < 3){
    Robot.drivertrain.setLeftMotors(0.6);
    Robot.drivertrain.setRightMotors(-0.6);
    Scheduler.getInstance().run();
   } else {
    Robot.drivertrain.setLeftMotors(0);
    Robot.drivertrain.setRightMotors(0);
    }
  }
  

  @Override
  public void teleopInit() {
    // This makes sure that the autonomous stops running when
    // teleop starts running. If you want the autonomous to
    // continue until interrupted by another command, remove
    // this line or comment it out.
   
    }
  

  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {}
}
