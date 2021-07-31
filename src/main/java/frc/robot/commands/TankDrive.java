// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class TankDrive extends Command {
  public TankDrive() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.drivertrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {}

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    double leftStickY = Robot.m_oi.GetDriverRawAxis(RobotMap.LEFT_STICK_Y);
    double rightStickY = Robot.m_oi.GetDriverRawAxis(RobotMap.RIGHT_STICK_Y);
    //double leftStickY = Robot.m_oi.GetDriverRawAxis(RobotMap.LEFT_STICK_Y);
    //double rightStickX = Robot.m_oi.GetDriverRawAxis(RobotMap.RIGHT_STICK_X);
    // apaga o de cima que os verdim funfa, foi mal caio do futuro

    //Robot.drivertrain.setLeftMotors(leftStickY * 0.7);
    Robot.drivertrain.setRightMotors(rightStickY * 0.7);
    Robot.drivertrain.setLeftMotors(leftStickY * 0.7);
   // Robot.drivertrain.setRightMotors(leftStickY * 0.7);
    //Robot.drivertrain.setLeftMotors(rightStickX * 0.3);
    //Robot.drivertrain.setRightMotors(rightStickX * -0.3);
    // apaga o de cima que os verdim funfa, foi mal caio do futuro, não esquece do robo.map ta
    //é eu sei retrabalho

    
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.drivertrain.setLeftMotors(0);
    Robot.drivertrain.setRightMotors(0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    this.end();
  }
}
