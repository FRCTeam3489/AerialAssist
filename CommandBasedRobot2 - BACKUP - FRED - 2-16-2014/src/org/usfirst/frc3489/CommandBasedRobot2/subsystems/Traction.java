/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc3489.CommandBasedRobot2.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc3489.CommandBasedRobot2.RobotMap;
import org.usfirst.frc3489.CommandBasedRobot2.commands.TractionUp;

/**
 *
 * @author Developer
 */
public class Traction extends Subsystem {
    // Put methods for controlling this subsystem
    Solenoid tractionsol = RobotMap.tractionsol;
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new TractionUp());
        //setDefaultCommand(new MySpecialCommand());
        
    }
        
    public void Tractionup() {
        tractionsol.set(true);
    }
    
    public void Tractiondown() {
        tractionsol.set(false);
    }
        
        
    }

