/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Constants.OIConstants;
import frc.robot.commands.AutoComplexCom;
import frc.robot.commands.ClearShooterCom;
import frc.robot.commands.DriveCom;
import frc.robot.commands.ForwardAuto;
import frc.robot.commands.LiftCom;
import frc.robot.commands.LowerCom;
import frc.robot.commands.ShootCom;
import frc.robot.commands.ShootingCom;
import frc.robot.commands.SpinLeft;
import frc.robot.commands.SpinRight;
import frc.robot.commands.TriggerCom;
import frc.robot.subsystems.DriveTrainSub;
import frc.robot.subsystems.LiftSub;
import frc.robot.subsystems.ShootSub;
import frc.robot.subsystems.ShuffleSub;
import frc.robot.subsystems.SpinSub;
import frc.robot.subsystems.TriggerSub;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a "declarative" paradigm, very little robot logic should
 * actually be handled in the {@link Robot} periodic methods (other than the
 * scheduler calls). Instead, the structure of the robot (including subsystems,
 * commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final DriveTrainSub driveTrainSub = new DriveTrainSub();
  private final LiftSub liftSub = new LiftSub();
  private final ShootSub shootSub = new ShootSub();
  private final SpinSub spinSub = new SpinSub();
  private final ShuffleSub shuffleSub = new ShuffleSub();
  private final TriggerSub triggerSub = new TriggerSub();

  private final Command forwardAuto = new ForwardAuto(driveTrainSub);
  private final Command autoComplexCom = new AutoComplexCom(driveTrainSub);

  SendableChooser<Command> chooser = new SendableChooser<>();

  Joystick joystick = new Joystick(OIConstants.kDriverControllerPort);

  AHRS ahrs = new AHRS(edu.wpi.first.wpilibj.I2C.Port.kMXP);
  //AHRS ahrs = new AHRS(SerialPort.Port.kUSB);
   boolean zero_yaw_pressed = joystick.getTrigger(); {
      if (zero_yaw_pressed) {
        ahrs.zeroYaw();
      }
      }      

  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {

    SmartDashboard.putBoolean("IMU Connected", ahrs.isConnected());
    SmartDashboard.putBoolean(  "IMU_IsCalibrating", ahrs.isCalibrating());
    SmartDashboard.putNumber(   "IMU_Yaw", ahrs.getYaw());
    SmartDashboard.putNumber(   "IMU_Pitch", ahrs.getPitch());
    SmartDashboard.putNumber(   "IMU_Roll", ahrs.getRoll());
    SmartDashboard.putNumber(   "IMU_CompassHeading", ahrs.getCompassHeading());
    SmartDashboard.putNumber(   "IMU_Accel_X", ahrs.getWorldLinearAccelX());
    SmartDashboard.putNumber(   "IMU_Accel_Y", ahrs.getWorldLinearAccelY());
    SmartDashboard.putBoolean(  "IMU_IsMoving", ahrs.isMoving());
    SmartDashboard.putBoolean(  "IMU_IsRotating", ahrs.isRotating());
    SmartDashboard.putNumber(   "RawGyro_X", ahrs.getRawGyroX());
    SmartDashboard.putNumber(   "RawGyro_Y", ahrs.getRawGyroY());
    SmartDashboard.putNumber(   "RawGyro_Z", ahrs.getRawGyroZ());
    SmartDashboard.putNumber(   "RawAccel_X", ahrs.getRawAccelX());
    SmartDashboard.putNumber(   "RawAccel_Y", ahrs.getRawAccelY());
    SmartDashboard.putNumber(   "RawAccel_Z", ahrs.getRawAccelZ());
    SmartDashboard.putNumber(   "RawMag_X", ahrs.getRawMagX());
    SmartDashboard.putNumber(   "RawMag_Y", ahrs.getRawMagY());
    SmartDashboard.putNumber(   "RawMag_Z", ahrs.getRawMagZ());
    SmartDashboard.putNumber(   "IMU_Temp_C", ahrs.getTempC());

    configureButtonBindings();

    driveTrainSub.setDefaultCommand(new DriveCom(() -> joystick.getRawAxis(1), () -> joystick.getRawAxis(3), driveTrainSub));

    chooser.addOption("Forward Auto", forwardAuto);
    chooser.addOption("Complex Auto", autoComplexCom);
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    new JoystickButton(joystick, 8).whileHeld(new ShootCom(shootSub));
    new JoystickButton(joystick, 7).whileHeld(new ClearShooterCom(shootSub));
    new JoystickButton(joystick, 6).whileHeld(new LiftCom(liftSub));
    new JoystickButton(joystick, 5).whileHeld(new LowerCom(liftSub));
    new JoystickButton(joystick, 1).whileHeld(new SpinLeft(spinSub));
    new JoystickButton(joystick, 3).whileHeld(new SpinRight(spinSub));
    new JoystickButton(joystick, 2).whenPressed(new ShootingCom(shootSub, shuffleSub, triggerSub));
    new JoystickButton(joystick, 4).whenPressed(new TriggerCom(triggerSub));

  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return chooser.getSelected();
  }
}
