/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;


public class DriveTrainSub extends SubsystemBase {
  private final SpeedControllerGroup leftMotors = new SpeedControllerGroup(new PWMVictorSPX(DriveConstants.kLeftMotor1Port), new PWMVictorSPX(DriveConstants.kLeftMotor2Port));
  private final SpeedControllerGroup rightMotors = new SpeedControllerGroup(new PWMVictorSPX(DriveConstants.kRightMotor1Port), new PWMVictorSPX(DriveConstants.kRightMotor2Port));
  private final DifferentialDrive drive = new DifferentialDrive(leftMotors, rightMotors);

  public DriveTrainSub() {
    drive.setSafetyEnabled(false);
  }
 
  public void drive(double leftMotors, double rightMotors) {
    drive.tankDrive(leftMotors, rightMotors);
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
