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
/**
 *
 */
public class DriveTrain extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController speedController1 = RobotMap.driveTrainSpeedController1;
    SpeedController speedController2 = RobotMap.driveTrainSpeedController2;
    SpeedController speedController3 = RobotMap.driveTrainSpeedController3;
    SpeedController speedController4 = RobotMap.driveTrainSpeedController4;
    public RobotDrive drive = RobotMap.driveTraindrive;
    SpeedController midWheel = RobotMap.driveTrainMidWheel;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new TankDrive());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void Tdrive (Joystick joystick1, Joystick joystick2) {
        drive.tankDrive(joystick1.getY(), joystick2.getY());
    }
    
    public void Strafe(Joystick joystick1) {
        double StrafeValue = joystick1.getX();
        RobotMap.driveTrainMidWheel.set(StrafeValue);
    }
}