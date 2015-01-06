
package com.frc4859;

import com.frc4859.commands.AcquirerIn;
import com.frc4859.commands.AcquirerOut;
import com.frc4859.commands.AcquirerStop;
import com.frc4859.commands.Lift;
import com.frc4859.commands.ShooterReverse;
import com.frc4859.commands.ShooterShot;
import com.frc4859.commands.ShooterStop;
//import com.frc4859.commands.autonomous.DriveInASquare;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    private final Joystick stick;
    private final Joystick xbox;
    private final JoystickButton intakeButton;
    private final JoystickButton outtakeButton;
    private final JoystickButton shotButton;
    private final JoystickButton reverseButton;
    
    public OI(){
        stick = new Joystick(1);
        //(new JoystickButton(stick, Joystick.ButtonType.kTop.value)).whenPressed(new DriveInASquare());
        intakeButton = new JoystickButton(stick,1);
        intakeButton.whenPressed(new AcquirerIn());
        intakeButton.whenReleased(new AcquirerStop());
        outtakeButton = new JoystickButton(stick,2);
        outtakeButton.whenPressed(new AcquirerOut());
        outtakeButton.whenReleased(new AcquirerStop());
        xbox = new Joystick(2);
        (new JoystickButton(xbox, 6)).whenPressed(new Lift());       
        shotButton = new JoystickButton(xbox,1);
        shotButton.whenPressed(new ShooterShot());
        shotButton.whenReleased(new ShooterStop());
        reverseButton = new JoystickButton(xbox,5);
        reverseButton.whenPressed(new ShooterReverse());
        reverseButton.whenReleased(new ShooterStop());
        
        
    }
    public Joystick getJoystick(){
        return stick;
    }
}

