// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class Move extends Command {
  double m_time, m_lspeed, m_rSpeed;
  public Move(double time, double lSpeed, double rSpeed ) {
    m_time=time;
    m_lspeed=lSpeed;
    m_rSpeed=rSpeed;
    // Use requires() here to declare subsystem dependencies
    requires(Robot.drivertrain);
    // eg. requires(chassis);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.drivertrain.setLeftMotors(m_lspeed);
    Robot.drivertrain.setRightMotors(m_rSpeed);
    setTimeout(m_time);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {}

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return isTimedOut();
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
  protected void interrupted() {}
}
