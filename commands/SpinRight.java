/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.SpinSub;

public class SpinRight extends CommandBase {
  private final SpinSub spinSub;
  /**
   * Creates a new SpinRight.
 * @param spinSub
   */
  public SpinRight(SpinSub subsystem) {
    spinSub = subsystem;
    addRequirements(spinSub);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    spinSub.SpinRight();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    spinSub.SpinRight();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    spinSub.Stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
