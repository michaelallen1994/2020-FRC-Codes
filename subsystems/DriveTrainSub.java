/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;


public class DriveTrainSub extends SubsystemBase {
  private final SpeedControllerGroup leftMotors = new SpeedControllerGroup(new PWMVictorSPX(DriveConstants.kLeftMotor1Port), new PWMVictorSPX(DriveConstants.kLeftMotor2Port));
  private final SpeedControllerGroup rightMotors = new SpeedControllerGroup(new PWMVictorSPX(DriveConstants.kRightMotor1Port), new PWMVictorSPX(DriveConstants.kRightMotor2Port));
  private final DifferentialDrive drive = new DifferentialDrive(leftMotors, rightMotors);
 
  public void drive(double leftMotors, double rightMotors) {
    drive.tankDrive(leftMotors, rightMotors);
  }

  // The left-side drive encoder
  private final Encoder leftEncoder =
   new Encoder(DriveConstants.kLeftEncoderPorts[0], DriveConstants.kLeftEncoderPorts[1],
               DriveConstants.kLeftEncoderReversed);

  // The right-side drive encoder
  private final Encoder rightEncoder =
   new Encoder(DriveConstants.kRightEncoderPorts[0], DriveConstants.kRightEncoderPorts[1],
               DriveConstants.kRightEncoderReveresed);

  public DriveTrainSub() {
    // Sets the distance per pulse for the encoders
    leftEncoder.setDistancePerPulse(DriveConstants.kEncoderDistancePerPulse);
    rightEncoder.setDistancePerPulse(DriveConstants.kEncoderDistancePerPulse);
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
