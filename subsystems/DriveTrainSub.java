/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
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

  // The left-side drive encoder
  private final Encoder leftEncoder =
  new Encoder(DriveConstants.kLeftEncoderPorts[0], DriveConstants.kLeftEncoderPorts[1],
              DriveConstants.kLeftEncoderReversed);

  // The right-side drive encoder
  private final Encoder rightEncoder =
  new Encoder(DriveConstants.kRightEncoderPorts[0], DriveConstants.kRightEncoderPorts[1],
              DriveConstants.kRightEncoderReversed);

  public DriveTrainSub() {
    leftEncoder.setDistancePerPulse(DriveConstants.kEncoderDistancePerPulse);
    rightEncoder.setDistancePerPulse(DriveConstants.kEncoderDistancePerPulse);
  }

  public void tankDrive(double rightMotors, double leftMotors) {
    drive.tankDrive(1, 1);
    drive.setSafetyEnabled(false);
  }

  public void resetEncoders() {
    leftEncoder.reset();
    rightEncoder.reset();
  }

  public double getAverageEncoderDistance() {
    return (leftEncoder.getDistance() + rightEncoder.getDistance()) / 2.0;
  }

   /**
   * Gets the left drive encoder.
   *
   * @return the left drive encoder
   */
  public Encoder getLeftEncoder() {
    return leftEncoder;
  }

  /**
   * Gets the right drive encoder.
   *
   * @return the right drive encoder
   */
  public Encoder getRightEncoder() {
    return rightEncoder;
  }

  //public void initDefaultCommmand() {
    //setDefaultCommand(new DriveCom(null, null, null));
  //}

  /**
   * Sets the max output of the drive.  Useful for scaling the drive to drive more slowly.
   *
   * @param maxOutput the maximum output to which the drive will be constrained
   */
  public void setMaxOutput(double maxOutput) {
    drive.setMaxOutput(1);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
