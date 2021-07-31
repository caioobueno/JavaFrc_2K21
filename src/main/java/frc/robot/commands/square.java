// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class square extends CommandGroup {
  /** Add your docs here. */
  public square() {
    addSequential(new Move(5, -0.4, -0.4));//reta longa1
    addSequential(new WaitCommand(0.2));//delay
    addSequential(new Move(1.1, -0.4, 0.4));//direita
    addSequential(new WaitCommand(0.2));//delay
    addSequential(new Move(1.5, -0.3, -0.3)); // reta pra direita 2
    addSequential(new WaitCommand(0.2));//delay
    addSequential(new Move(1.1, -0.4, 0.4));//direita2
    addSequential(new WaitCommand(0.2));//delay
    addSequential(new Move(5, -0.3, -0.3));//reta longa volta
    addSequential(new WaitCommand(0.2));//delay
    addSequential(new Move(1.1, -0.4, 0.4));//direita3
    addSequential(new WaitCommand(0.2));//delay
    addSequential(new Move(1.1, -0.3, -0.3));// reta pra direita 4
    addSequential(new Move(1.1, -0.4, 0.4));//direita4
    // Add Commands here:
    // e.g. addSequential(new Command1());
    // addSequential(new Command2());
    // these will run in order.

    // To run multiple commands at the same time,
    // use addParallel()
    // e.g. addParallel(new Command1());
    // addSequential(new Command2());
    // Command1 and Command2 will run in parallel.

    // A command group will require all of the subsystems that each member
    // would require.
    // e.g. if Command1 requires chassis, and Command2 requires arm,
    // a CommandGroup containing them would require both the chassis and the
    // arm.
  }
}
