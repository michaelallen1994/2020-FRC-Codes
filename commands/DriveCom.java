/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrainSub;

public class DriveCom extends CommandBase {
  private final DriveTrainSub driveTrainSub;
  private final DoubleSupplier Left;
  private final DoubleSupplier Right;
  /**
   * Creates a new DriveCom.
 * @param driveTrainSub
   */
  public DriveCom(DoubleSupplier left, DoubleSupplier right, DriveTrainSub driveTrain) {
    driveTrainSub = driveTrain;
    Left = left;
    Right = right;

    addRequirements(driveTrainSub);
    
    // Use addRequirements() here to declare subsystem dependencies.
  }

// Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    driveTrainSub.drive(Left.getAsDouble(), Right.getAsDouble());
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
