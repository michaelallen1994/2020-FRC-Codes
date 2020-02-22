/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Constants.AutoConstants;
import frc.robot.subsystems.DriveTrainSub;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/latest/docs/software/commandbased/convenience-features.html
public class AutoComplexCom extends SequentialCommandGroup {
  /**
   * Creates a new AutoComplexCom.
   */
  public AutoComplexCom(DriveTrainSub driveTrainSub) {
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());
    super();
    addCommands(new DriveForward(AutoConstants.kAutoDriveDistanceInches, AutoConstants.kAutoDriveDistanceInches, driveTrainSub));
    addCommands(new AutoTurnCom(AutoConstants.kTurnToThisdegree, driveTrainSub));
  }
}
