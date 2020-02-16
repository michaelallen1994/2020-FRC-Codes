/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class DriveConstants {
        public static final int kLeftMotorPort = 0;
        public static final int kRightMotorPort = 1;
        public static final boolean kLeftMotorInverted = true;       
    }

    public static final class ShootConstants {
        public static final int kShootMotor1Port = 4;
        public static final double kShootMotorSpeed = -1;
        public static final double kShootMotorClearSpeed = 1;
        public static final double kShuffleMotorSpeed = 1;
        public static final int kShuffleMotorPort = 2;
    }

    public static final class SpinConstants {
        public static final int kSpinMotor1Port = 5;
        public static final double kSpinMotorRightSpeed = 1;
        public static final double kSpinMotorLeftSpeed = -1;
    }

    public static final class LiftConstants {
        public static final int kLiftMotor1Port = 6;
        public static final double kLiftMotorSpeed = 1;
        public static final double kLiftMotorLowerSpeed = -.5;
    }

    public static final class AutoConstants {
        public static final double kAutoDriveDistanceInches = 60;
        public static final double kAutoBackupDistanceInches = 20;
        public static final double kAutoDriveSpeed = 0.5;
      }

    public static final class RightTurnConstants {
        public static final double kAutoRightTurnInches = 20;
        public static final double kAutoLeftTurnInches = 0;
        public static final double kAutoDriveSpeed = 0.75;
    }

    public static final class LeftTurnConstants {
        public static final double kAutoLeftTurnInches = 20;
        public static final double kAutoRightTurnInches = 0;
        public static final double kAutoDriveSpeed = 0.75;
    }

      public static final class OIConstants {
        public static final int kDriverControllerPort = 0;
      }
}
