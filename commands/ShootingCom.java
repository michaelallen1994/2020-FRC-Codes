/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.ShootSub;
import frc.robot.subsystems.ShuffleSub;
import frc.robot.subsystems.TriggerSub;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/latest/docs/software/commandbased/convenience-features.html
public class ShootingCom extends SequentialCommandGroup {
  /**
   * Creates a new ShootingCom.
   */
  public ShootingCom(ShootSub shootSub, ShuffleSub shuffleSub, TriggerSub triggerSub) {
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());
    super();
      new ShootCom(shootSub);
      new ShuffleCom(shuffleSub);
      new TriggerCom(triggerSub);

    //new ShootCom(shoot);
    //new ShuffleCom(shuffleSub);

  }
}
