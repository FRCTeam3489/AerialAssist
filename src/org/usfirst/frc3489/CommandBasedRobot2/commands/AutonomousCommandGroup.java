/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc3489.CommandBasedRobot2.commands;

import edu.wpi.first.wpilibj.Timer;
//import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.*;

/**
 *
 * @author Developer
 */
public class AutonomousCommandGroup extends CommandGroup {
    
    public AutonomousCommandGroup() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.
        //System.out.println("It's not evne ogre yet");
        
        //FROM FRED:  Fix your variable and class names to be less ridiculo
        Timer.delay(.05);
        addSequential(new VisionCommand());
        addSequential(new AutonomousLoader());
        addParallel(new AutonomousArmPosition());
        addSequential(new AutonomousDrive());
        addSequential(new ShootBall());
         
        //addSequential(new ReadyPuncher());
        //addSequential(new AutonomousLoader());
       
        //addSequential(new AutonomousCommand());
        //addSequential(new AutonomousArmPosition());
        //addSequential(new AutonomousDrive());
        //addSequential(new ShootBall());
        
        
        //addSequential(new AutonomousEjector());
        
//        addSequential(new proxSensor());
        
        
        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.
        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
