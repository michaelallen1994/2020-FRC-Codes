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

public class ShuffleSub extends SubsystemBase {
  private final SpeedController shuffleMotor = new PWMVictorSPX(ShootConstants.kShuffleMotorPort);
  /**
   * Creates a new ShuffleSub.
   */

  public void Shuffle() {
    shuffleMotor.set(ShootConstants.kShuffleMotorSpeed);
  }

  public void stop() {
    shuffleMotor.set(0);
  }

  public ShuffleSub() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
