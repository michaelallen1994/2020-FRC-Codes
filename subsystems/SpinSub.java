/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.SpinConstants;

public class SpinSub extends SubsystemBase {
  private final SpeedController spinMotor = new Spark(SpinConstants.kSpinMotor1Port);

  public void SpinLeft() {
    spinMotor.set(SpinConstants.kSpinMotorLeftSpeed);
  }

  public void SpinRight() {
    spinMotor.set(SpinConstants.kSpinMotorRightSpeed);
  }

  public void Stop() {
    spinMotor.set(0);
  }
  /**
   * Creates a new SpinSub.
   */
  public SpinSub() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
