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



public class AutonomousEjector extends Command {
    double StartTimer;
    public AutonomousEjector() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.ejector);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        StartTimer = Timer.getFPGATimestamp();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.ejector.ejectorMotor(1);
    }

    // Make this return true when this Command no longer needs to run execute()
    
    //FROM FRED:  The cancel condition should be based on proximity sensor values.
    //          We need to test if the proximity sensor is going to return a high
    //          or low voltage and use that as the condition here.
    
    protected boolean isFinished() {
        if (Timer.getFPGATimestamp() - StartTimer >= 1) {
            return true;
        } else {
            return false;
        }
    }
    // Called once after isFinished returns true
    protected void end() {
        Robot.ejector.ejectorMotor(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        Robot.ejector.ejectorMotor(0);
    }
}
