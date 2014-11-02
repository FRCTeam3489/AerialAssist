package org.usfirst.frc3489.CommandBasedRobot2.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc3489.CommandBasedRobot2.Robot;
/**
 * John - Driver Control
 * Command to put button on smart dashboard from OI - used in testing
 * ArmLocation command should be called from ReadyPuncher during normal use
 * Smart dashboard button is to show solenoid status without attempting to
 * turn the puncher motor 
 */
public class  ArmCurrentPosition extends Command {
    public ArmCurrentPosition() {
        requires(Robot.arm);
    }

    protected void initialize() {
    }

    protected void execute() {
        Robot.arm.armLocation();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
