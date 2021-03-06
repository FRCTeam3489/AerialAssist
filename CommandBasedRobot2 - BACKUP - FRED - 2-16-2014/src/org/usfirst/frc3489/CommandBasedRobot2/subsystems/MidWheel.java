// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3489.CommandBasedRobot2.subsystems;

import org.usfirst.frc3489.CommandBasedRobot2.RobotMap;
import org.usfirst.frc3489.CommandBasedRobot2.commands.*;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc3489.CommandBasedRobot2.Robot;


/**
 *
 */
public class MidWheel extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController MidWheel = RobotMap.driveTrainMidWheel;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	//setDefaultCommand(new Strafe());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void Strafe(Joystick joystick1, Joystick joystick2) {
        if (joystick1.getRawButton(1) == true) {
            RobotMap.driveTrainMidWheel.set(-1);
        }
        if (joystick2.getRawButton(1) == true) {
            RobotMap.driveTrainMidWheel.set(1);
        }
        if (joystick1.getRawButton(1) == true && joystick2.getRawButton(1) == true){
            RobotMap.driveTrainMidWheel.set(0);
        }
        if (joystick1.getRawButton(1) == false && joystick2.getRawButton(1) == false){
            RobotMap.driveTrainMidWheel.set(0);
        }
    }
}


