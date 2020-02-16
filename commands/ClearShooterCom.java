/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ShootSub;

public class ClearShooterCom extends CommandBase {
  private final ShootSub shootSub;
  /**
   * Creates a new ClearShooterCom.
 * @param shoot
   */
  public ClearShooterCom(ShootSub subsystem) {
    shootSub = subsystem;
    addRequirements(shootSub);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    shootSub.Clear();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    shootSub.Clear();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    shootSub.Stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
