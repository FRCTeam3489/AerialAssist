//Robot Changes for version 3.0:
//  1.  Switched manipulator joystick buttons 2 and 4.  2 now shoots and reloads
//  and is the shooting command group.  4 just shoots.  
//  2.  Gave manipulator the ability to drop traction wheels using buttons 5
//  and 6.  5 drops, 6 raises.  Kept driver's capability to drop traction wheels
//  as well.
//  3.  We switched the emergency stop for the ready puncher to button 7 from 
//  button 6.


package org.usfirst.frc3489.CommandBasedRobot2;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.image.CriteriaCollection;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
//import org.usfirst.frc3489.CommandBasedRobot2.RobotMap.airgetterAirmaker;
import org.usfirst.frc3489.CommandBasedRobot2.commands.*;
import org.usfirst.frc3489.CommandBasedRobot2.subsystems.*;
import org.usfirst.frc3489.CommandBasedRobot2.subsystems.ProxSensor;
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
    Command autoCommandGroup;
    //John - Troublshooting
    //ReadyPuncher requries arm - Arm...Position also requires arm
    //ReadyPuncher is running non-stop
    //Command readyPuncher;
    
    public static OI oi;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static DriveTrain driveTrain;
    public static ClawLoader clawLoader;
    public static Ultra ultra;
    public static MidWheelSol midWheelSol;
    public static Arm arm;
    public static Airgetter airgetter;
    public static Claw claw;
    public static Ultra2 ultra2;
    public static MidWheel midwheel;
    public static Traction tractionsol;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static ProxSensor pSensor;
    public static Ejector ejector;
    public static ReadyPuncher readyPuncher;
    public static VisionSubsystem visionSubsystem;
    public static Relay REye;
    public static CriteriaCollection cc ;
    //John 03-01-14
    //Add Reader
    public static Reader reader;
    
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
	RobotMap.init();
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrain = new DriveTrain();
        clawLoader = new ClawLoader();
        ultra = new Ultra();
        midWheelSol = new MidWheelSol();
        arm = new Arm();
        airgetter = new Airgetter();
        claw = new Claw();
        ultra2 = new Ultra2();
        midwheel = new MidWheel();
        tractionsol = new Traction();
        pSensor = new ProxSensor();
        ejector = new Ejector();
        visionSubsystem = new VisionSubsystem();
        //John 03-01-14
        //Add Reader
        reader = new Reader();
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();
	//airgetterAirmaker.start();
        // instantiate the command used for the autonomous period
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
        autoCommandGroup = new AutonomousCommandGroup();
        readyPuncher = new ReadyPuncher();
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
        
    }
    public void autonomousInit() {
        // schedule the autonomous command (example)
        
        if (autoCommandGroup != null) autoCommandGroup.start();
        
    }
    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }
    public void teleopInit() {
	// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autoCommandGroup != null) autoCommandGroup.cancel();
        //if (readyPuncher != null) readyPuncher.start();
    }
    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        
    }
    /**
     * This function called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
    public void disabledInit() {
        if (autoCommandGroup != null) autoCommandGroup.cancel();
        if (readyPuncher != null) readyPuncher.cancel();
        
    }
}
