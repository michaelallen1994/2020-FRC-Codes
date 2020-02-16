/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ShootConstants;

public class ShootSub extends SubsystemBase {
  private final SpeedController shootMotor = new PWMVictorSPX(ShootConstants.kShootMotor1Port);

  public void Shoot() {
    shootMotor.set(ShootConstants.kShootMotorSpeed);
  }

  public void Clear() {
    shootMotor.set(ShootConstants.kShootMotorClearSpeed);
  }

  public void Stop() {
    shootMotor.set(0);
  }

  /**
   * Creates a new ShootSub.
   */
  public ShootSub() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
