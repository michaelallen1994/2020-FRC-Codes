/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;


public class DriveTrainSub extends SubsystemBase {
  /**
   * Creates a new DriveTrainSub.
   */

   // The motors on the left side of the drive.
  private final SpeedController leftMotors = new PWMVictorSPX(DriveConstants.kLeftMotorPort);

  // The motors on the right side of the drive.
  private final SpeedController rightMotors = new PWMVictorSPX(DriveConstants.kRightMotorPort);

  // The robot's drive
  private final DifferentialDrive drive = new DifferentialDrive(leftMotors, rightMotors);

 
  public void tankDrive(double rightMotors, double leftMotors) {
    drive.tankDrive(0, 0);
    drive.setSafetyEnabled(false);
  }

  /**
   * Sets the max output of the drive.  Useful for scaling the drive to drive more slowly.
   *
   * @param maxOutput the maximum output to which the drive will be constrained
   */
  public void setMaxOutput(double maxOutput) {
    drive.setMaxOutput(.5);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
