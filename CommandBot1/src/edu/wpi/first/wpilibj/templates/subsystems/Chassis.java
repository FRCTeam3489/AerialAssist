/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.OI;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.DriveWithJoystick;
/**
 *
 * @author John
 */
public class Chassis extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    RobotDrive drive;
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new DriveWithJoystick());
        
    }
   public Chassis() {
       //drive = new RobotDrive(2,1);
       drive = new RobotDrive(RobotMap.FrntLftWhl,RobotMap.BckLftWhl,RobotMap.FrntRghtWhl,RobotMap.BckRghtWhl);
       drive.setSafetyEnabled(false);
   }
   //public void straight() {
   //    drive.arcadeDrive(1.0,0.0);
   //}
   //public void turnLeft(){
   //    drive.arcadeDrive(0.0,1.0);
   //}
   
   public void driveWithJoystick(){
       //drive.arcadeDrive(stick);
       drive.tankDrive(OI.Joystick1.getY() * -1.0, OI.Joystick2.getY() * -1.0);
   }
}
