// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc3489.CommandBasedRobot2;
import org.usfirst.frc3489.CommandBasedRobot2.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public Joystick joystick1;
    public JoystickButton tractionWheelsDownButton;
    public Joystick joystick2;
    public JoystickButton clawLoaderInsertButton;
    public JoystickButton clawLoaderEjectButton;
    public JoystickButton armLowGoalButton;
    public JoystickButton armShootingButton;
    public JoystickButton armVerticalButton;
    public JoystickButton armFloorPickupButton;
    public Joystick joystick3;
    public JoystickButton clawOpenButton;
    public JoystickButton midwheelDownButton;
    public JoystickButton midwheelUpButton;
    public JoystickButton tractionWheelsUpButton;
    public JoystickButton JS3TractionDown;
    public JoystickButton JS3TractionUp;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton readyMotor;
    public JoystickButton shootBall;
    public JoystickButton EmergencyMotorStop;
    public JoystickButton strafeL;
    public JoystickButton strafeR;
    public JoystickButton shootAndReload;
    public JoystickButton TractionShoot;
    
    //John - Driver Control
    //Change the puncher to be controled by the driver
    //Prevent setting the puncher in floor and low goal
    public JoystickButton setPuncher;
    
    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        joystick3 = new Joystick(3);
        armFloorPickupButton = new JoystickButton(joystick3, 8);
        armFloorPickupButton.whenPressed(new ArmFloorPickupPosition());
        
        armLowGoalButton = new JoystickButton(joystick3, 9);
        armLowGoalButton.whenPressed(new ArmLowGoalPosition());
        
        armShootingButton = new JoystickButton(joystick3, 10);
        armShootingButton.whenPressed(new ArmShootingPosition());
        
      //  armVerticalButton = new JoystickButton(joystick3, 11);
      //  armVerticalButton.whenPressed(new ArmVerticalPosition());
        
        clawOpenButton = new JoystickButton(joystick3, 1);
        clawOpenButton.whileHeld(new ClawOpen ());
        
        shootBall = new JoystickButton(joystick3, 4);
        //Driver Control
        shootBall.whenPressed(new ShootBall());
        //Done:Brian fixed issue with button six no need to change buttons 
        EmergencyMotorStop = new JoystickButton(joystick3, 7);
        
        shootAndReload = new JoystickButton(joystick3, 2);
        shootAndReload.whenPressed(new ShootingCommandGroup());
        
        
//        JS3TractionDown = new JoystickButton(joystick3, 5);
//        JS3TractionDown.whileHeld(new TractionDown());
//        
//        JS3TractionUp = new JoystickButton(joystick3, 6);
//        JS3TractionUp.whileHeld(new TractionUp());
        
        //TODO: John - Remove 12 only dropping traction not shooting
        //TractionShoot = new JoystickButton(joystick3, 12);
        //TractionShoot.whenPressed(new DropwheelShoot());

        //Driver Control
        setPuncher = new JoystickButton(joystick3, 3);
        setPuncher.whenPressed(new ReadyPuncher());
        
        
        joystick2 = new Joystick(2);
//        tractionWheelsUpButton = new JoystickButton(joystick2, 5);
//        tractionWheelsUpButton.whenPressed(new TractionUp());
//        
//        tractionWheelsDownButton = new JoystickButton(joystick2, 3);
//        tractionWheelsDownButton.whenPressed(new TractionDown());
        
        

//Command Group - Currently Empty
        clawLoaderEjectButton = new JoystickButton(joystick2, 4);
        clawLoaderEjectButton.whileHeld(new WheelLoaderBackdrive());
        
        clawLoaderInsertButton = new JoystickButton(joystick2, 6);
        clawLoaderInsertButton.whileHeld(new WheelLoaderInsert());
        //clawLoaderInsertButton.whenPressed(new WheelLoaderInsert());        
        
        joystick1 = new Joystick(1);
        midwheelDownButton = new JoystickButton(joystick1, 5);
        midwheelDownButton.whenPressed(new LowerMidWheel ());
        midwheelUpButton = new JoystickButton(joystick1, 3);
        midwheelUpButton.whenPressed(new RaiseMidWheel());
        tractionWheelsDownButton = new JoystickButton(joystick1, 1);
        tractionWheelsDownButton.toggleWhenPressed(new TractionTog());
        
	    
        // SmartDashboard Buttons
        SmartDashboard.putData("Get Arm Location", new ArmCurrentPosition());
        
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("TankDrive", new TankDrive());
        SmartDashboard.putData("WheelLoaderDoNothing", new WheelLoaderDoNothing());
        SmartDashboard.putData("WheelLoaderInsert", new WheelLoaderInsert());
        SmartDashboard.putData("WheelLoaderBackdrive", new WheelLoaderBackdrive());
       // SmartDashboard.putData("EjectBall", new EjectBall());
        SmartDashboard.putData("InsertBall", new InsertBall());
       // SmartDashboard.putData("LoaderArmExtension", new LoaderArmExtension());
        SmartDashboard.putData("Reader", new Reader());
        SmartDashboard.putData("TractionDown", new TractionDown());
        //SmartDashboard.putData("OmniDown", new OmniDown());
        SmartDashboard.putData("ArmLowGoalPosition", new ArmLowGoalPosition());
        SmartDashboard.putData("ArmShootingPosition", new ArmShootingPosition());
        SmartDashboard.putData("ArmVerticalPosition", new ArmVerticalPosition());
        SmartDashboard.putData("ArmFloorPickupPosition", new ArmFloorPickupPosition());
        
        //SmartDashboard.putData("StrafeDrive", new StrafeDriveL());
        /*SmartDashboard.putData("Air", new Air());
        SmartDashboard.putData("ClawOpen", new ClawOpen());
        SmartDashboard.putData("OmNomBitClose", new OmNomBitClose());*/
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getJoystick1() {
        return joystick1;
    }
    public Joystick getJoystick2() {
        return joystick2;
    }
    public Joystick getJoystick3() {
        return joystick3;
    }
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}
