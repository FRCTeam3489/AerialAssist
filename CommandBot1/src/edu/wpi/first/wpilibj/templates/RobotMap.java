package edu.wpi.first.wpilibj.templates;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
    
    
    public static final int BckRghtWhl = 9;
    public static final int BckLftWhl = 2;
    public static final int FrntRghtWhl = 1;
    public static final int FrntLftWhl = 10;
    public static final int Sol = 1;
    public static final int Sol2 = 2;
    public static final int Sol3 = 3;
    public static final int Sol4 = 4;
    public static final int PressureSensor = 1;
    public static final int RelayComp = 4;
    public static final int Switch = 2;
    public static final int Switch2 = 5;
    public static final int ConveyorMotorLow = 3;
    public static final int Shoot1 = 4;
    public static final int Shoot2 = 5;
  

// John
//    public static final int JStick = 1;
//    public static final int JStick2 = 2;
//    public static final int JStick3 = 3;
// Using import static edu.wpi.first.wpilibj.templates.RobotMap.Jstick;
// in OI.java resulted in error
//    static import declaration are not suppported in -source 1.3
//    (use -source 5 or higher to enable static import declaration)
// removed public static final int Jstick = 1; 
// in BototMap.java and used number in JoyStick command
}
