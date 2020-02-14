/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrainSub;

public class TurnLeftCom extends CommandBase {
  private final DriveTrainSub drive;
  public final double distance;
  public final double speed;
  /**
   * Creates a new TurnLeftCom.
   * 
   * @param drive
   * @param kAutoLeftTurnInches
   * @param kAutoDriveSpeed
   */
  public TurnLeftCom(double Inches, double Speed, DriveTrainSub Drive) {
    distance = Inches;
    speed = Speed;
    drive = Drive;

    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    drive.resetEncoders();
    drive.arcadeDrive(speed, 0);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
