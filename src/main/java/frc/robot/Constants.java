// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static class ControllerConstants {

        public static final int USB_LEFT_STICK = 0;
        public static final int USB_RIGHT_STICK = 1;
        public static final int USB_CONTROLLER = 2;

        public static final int TRIGGER = 1;
	    public static final int BUTTON_MIDDLE = 2;
	    public static final int BUTTON_LEFT = 3;
	    public static final int BUTTON_RIGHT = 4;

    }
    public static class DriveConstants {
        public static final int ID_LEFT_FRONT = 10;
        public static final int ID_LEFT_REAR = 11;
        public static final int ID_RIGHT_FRONT = 15;
        public static final int ID_RIGHT_REAR = 16;

        public static final double LEFT_DEADZONE = 0.15;
        public static final double RIGHT_DEADZONE = 0.15;

        public static final double DIAMETER = 6.0;
        public static final double CIRCUMFERENCE = Math.PI * DIAMETER;
        public static final double GEAR_RATIO = 8.71;

        public static final double REV_TO_IN_K = CIRCUMFERENCE / GEAR_RATIO;
        public static final double IN_TO_REV_K = GEAR_RATIO / CIRCUMFERENCE;

        public static final boolean IS_DEADZONE = true;
	    
	     public static class limelight {
       /*  public static final double CATAPULTLEGNTH = ?;
        public static final double CATAPULTANGLE = ?;
        public static final double SPRINGCONSTANT = ?;   
        public static final double CAMHEIGHT = ?;
        public static final double CAMANGLE = ?;
        public static final int HUBHEIGHT = 104;
        public static final double TARMACDISTANCE = 84.75;
        public static final int TARGETDIAMETER = 48;
        public static final double TOTALANGLE = Math.tan((HUBHEIGHT-CAMHEIGHT) / TARMACDISTANCE);
        public static final double CAMANGLECOMPLIMENT = TOTALANGLE - CAMANGLE;
        public static final double TARGETAREA = Math.PI * TARGETDIAMETER;
        public static final double TRUEDISTANCE = (HUBHEIGHT-CAMHEIGHT)/(Math.tan(CAMANGLE-CAMANGLECOMPLIMENT)); */
	}

    }
}
