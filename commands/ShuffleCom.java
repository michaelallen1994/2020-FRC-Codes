/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ShuffleSub;

public class ShuffleCom extends CommandBase {
  private final ShuffleSub shuffleSub;
  /**
   * Creates a new ShuffleCom.
   */
  public ShuffleCom(ShuffleSub subsystem) {
    shuffleSub = subsystem;
    addRequirements(shuffleSub);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    shuffleSub.Shuffle();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    shuffleSub.Shuffle();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    shuffleSub.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
