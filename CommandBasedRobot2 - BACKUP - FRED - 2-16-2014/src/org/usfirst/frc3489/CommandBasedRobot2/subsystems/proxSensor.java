/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc3489.CommandBasedRobot2.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DigitalInput;
import org.usfirst.frc3489.CommandBasedRobot2.RobotMap;

/**
 *
 * @author Developer
 */
public class proxSensor extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    DigitalInput PSensor = RobotMap.pSensor;
    boolean proximitySensorValue = false;
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public boolean getSensorState() {
        proximitySensorValue = PSensor.get();
        System.out.println("sensorvalue: " + proximitySensorValue);
        return proximitySensorValue;
    }
}
