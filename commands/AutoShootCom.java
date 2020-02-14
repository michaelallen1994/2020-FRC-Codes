/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.ShootSub;
import frc.robot.Constants.AutoConstants;
import frc.robot.subsystems.DriveTrainSub;
import frc.robot.commands.DriveDistanceCom;
import frc.robot.commands.ShootCom;


// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/latest/docs/software/commandbased/convenience-features.html
public class AutoShootCom extends SequentialCommandGroup {
  /**
   * Creates a new AutoShootCom.
   * @param driveTrainSub
   */
  public AutoShootCom(DriveTrainSub drive, ShootSub shoot) {
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());
    super();
    new DriveDistanceCom(AutoConstants.kAutoDriveDistanceInches, AutoConstants.kAutoDriveSpeed, drive);
    new DriveDistanceCom(36, .5, drive);
    new ShootCom(shoot);
  }
}
