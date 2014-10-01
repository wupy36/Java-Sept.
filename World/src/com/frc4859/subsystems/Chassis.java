/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frc4859.subsystems;

import com.frc4859.commands.DriveWithJoystick;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Andy
 */
public class Chassis extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    RobotDrive drive;
    public void initDefaultCommand() {
        setDefaultCommand(new DriveWithJoystick()); //set default command
    }
    public Chassis(){
        drive = new RobotDrive(1, 6, 7, 8);
        drive.setSafetyEnabled(false);
    }
    public void straight(){ //sets the motor speeds to drive straight (no turn)
        drive.arcadeDrive(1.0, 0.0);
    }
    public void turnLeft(){
        drive.arcadeDrive(0.0, 1.0);
    }
    public void driveWithJoystick(Joystick stick){
        drive.mecanumDrive_Polar(stick.getMagnitude(), stick.getDirectionDegrees(), stick.getTwist());
    }
    
}
