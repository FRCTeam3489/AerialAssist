/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc3489.CommandBasedRobot2.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc3489.CommandBasedRobot2.Robot;

/**
 *
 * @author Developer
 */
public class AutonomousDrive extends Command {
    public double StartTimer;
    public double avgDistance;
    public double x;
    public AutonomousDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.driveTrain);
        requires(Robot.ultra);
        requires(Robot.ultra2);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        StartTimer = Timer.getFPGATimestamp();
    }
    
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        /*avgDistance = (Robot.ultra.conversion() + Robot.ultra2.conversion()) / 2;
        if (Timer.getFPGATimestamp() - StartTimer < 1.5) {
            Robot.driveTrain.AutoTDrive(-.75, -.75);
        } else if (Timer.getFPGATimestamp() - StartTimer < 2.25) {
            Robot.driveTrain.AutoTDrive(-.5, -.5);
        } else {
            Robot.driveTrain.AutoTDrive(-.3, -.3);
        }*/
        avgDistance = (Robot.ultra.conversion() + Robot.ultra2.conversion()) / 2;
        x = (-2.55 + (Timer.getFPGATimestamp() - StartTimer));
        if (Timer.getFPGATimestamp() - StartTimer < 2.55) {
            //x = (-1.5 + (Timer.getFPGATimestamp() - StartTimer));
            Robot.driveTrain.AutoTDrive(-.75, -.75);
        } else if (x <= .75) {
            //x = (-1.5 + (Timer.getFPGATimestamp() - StartTimer));
            Robot.driveTrain.AutoTDrive(-.75 + x, -.75 + x);
        }
        //ultra.conversion();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
//        if(Robot.ultra.conversion() <= 5) {
//            return true;
//        }
        if(Timer.getFPGATimestamp() - StartTimer > 3.3) {
            //Robot.driveTrain.drive.tankDrive(0, 0);
            return true;
        } else {
        return false;
        }
    }

    // Called once after isFinished returns true
    protected void end() {
        //Robot.driveTrain.AutoTDrive(0, 0);
        //Robot.ultra.turnoff();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
