/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc3489.CommandBasedRobot2.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc3489.CommandBasedRobot2.Robot;

/**
 *
 * @author Developer
 */
public class TractionUp extends Command {
    
    public TractionUp() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.tractionsol);
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.tractionsol.Tractionup();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
