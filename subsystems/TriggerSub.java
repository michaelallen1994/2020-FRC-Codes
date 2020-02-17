/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.TriggerConstants;

public class TriggerSub extends SubsystemBase {
  Servo servo = new Servo(TriggerConstants.kServo1Port);

public void Trigger() {
  servo.setAngle(0);
}

public void Release() {
  servo.setAngle(1);
}

public void Stop() {
  servo.setAngle(0);
}
  /**
   * Creates a new TriggerSub.
   */
  public TriggerSub() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
