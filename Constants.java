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

    public static final class OIConstants {
        public static final int kDriverControllerPort = 0;
      }
    public static final class DriveConstants {
        public static final int kLeftMotor1Port = 0;
        public static final int kLeftMotor2Port = 1;
        public static final int kRightMotor1Port = 2;
        public static final int kRightMotor2Port = 3;

        public static final int[] kLeftEncoderPorts = new int[]{0, 1};
        public static final int[] kRightEncoderPorts = new int[]{2, 3};
        public static final boolean kLeftEncoderReversed = false;
        public static final boolean kRightEncoderReveresed = true;

        public static final int kEncoderCPR = 1024;
        public static final double kWheelDiameterInches = 6;
        public static final double kEncoderDistancePerPulse =
            // Assumes the encoders are directly mounted on the wheel shafts
            (kWheelDiameterInches * Math.PI) / (double) kEncoderCPR;
            
        public static final boolean kGyroReversed = false;

        public static final double kStabilizationP = 1;
        public static final double kStabilizationI = 0.5;
        public static final double kStabilizationD = 0;
        
        public static final double kTurnP = 1;
        public static final double kTurnI = 0;
        public static final double kTurnD = 0;
        
        public static final double kMaxTurnRateDegPerS = 30;
        public static final double kMaxTurnAccelerationDegPerSSquared = 300;
        
        public static final double kTurnToleranceDeg = 5;
        public static final double kTurnRateToleranceDegPerS = 10; // degrees per second
 
    }

    public static final class ShootConstants {
        public static final int kShootMotor1Port = 4;
        public static final double kShootMotorSpeed = -1;
        public static final double kShootMotorClearSpeed = 1;
        public static final double kShuffleMotorSpeed = 1;
        public static final int kShuffleMotorPort = 7;
    }

    public static final class SpinConstants {
        public static final int kSpinMotor1Port = 5;
        public static final double kSpinMotorRightSpeed = .1;
        public static final double kSpinMotorLeftSpeed = -.1;
    }

    public static final class LiftConstants {
        public static final int kLiftMotor1Port = 6;
        public static final double kLiftMotorSpeed = 1;
        public static final double kLiftMotorLowerSpeed = -.5;
    }

    public static final class TriggerConstants {
        public static final int kServo1Port = 9;
    }

    public static final class AutoConstants {
    public static final double kAutoDriveDistanceInches = 36;
    public static final double kAutoBackupDistanceInches = 20;
    public static final double kAutoDriveSpeed = 0.5;
    public static final double kTurnToThisdegree = 90;
  }


}
