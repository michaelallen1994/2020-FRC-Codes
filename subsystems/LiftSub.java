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
import frc.robot.Constants.LiftConstants;

public class LiftSub extends SubsystemBase {
  private final SpeedController liftMotor = new Spark(LiftConstants.kLiftMotor1Port);

  public void Lift() {
    liftMotor.set(LiftConstants.kLiftMotorSpeed);
  }

  public void Lower() {
    liftMotor.set(LiftConstants.kLiftMotorLowerSpeed);
  }

  public void Stop() {
    liftMotor.set(0);
  }
  
    /**
   * Creates a new LiftSub.
   */
  public LiftSub() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
