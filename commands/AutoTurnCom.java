/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrainSub;

public class AutoTurnCom extends CommandBase {
  private final DriveTrainSub driveTrainSub;
  /**
   * Creates a new AutoTurnCom.
   */
  public AutoTurnCom(double kTurnToThisDegree, DriveTrainSub subsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    driveTrainSub = subsystem;
    addRequirements(driveTrainSub);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    driveTrainSub.drive(0, .5);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    driveTrainSub.drive(0, .5);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    driveTrainSub.drive(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
