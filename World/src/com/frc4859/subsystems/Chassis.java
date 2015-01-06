/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frc4859.subsystems;

import com.frc4859.commands.DriveWithJoystick;
//import edu.wpi.first.wpilibj.Gyro;
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
    //private Gyro gyro;
    
    //double Kp = 0.03;

    public void initDefaultCommand() {
       // gyro.reset();
        setDefaultCommand(new DriveWithJoystick()); //set default command
        //drive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        //drive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        
    }
    public Chassis(){
        drive = new RobotDrive(7, 8, 6, 1);
        drive.setSafetyEnabled(false);
        //gyro = new Gyro(2);             // Gyro on Analog Channel 2
        drive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        drive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
    }
    public void straight(){ //sets the motor speeds to drive straight (no turn)
        //drive.mecanumDrive_Cartesian(0.0, -0.35, 0.0, 0.0);
        //drive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        //drive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        
        //double angle = gyro.getAngle(); // get current heading
        drive.mecanumDrive_Cartesian(-0.2, -0.35, 0.0, 0.0/*-angle*Kp*/); // drive towards heading 0    
    }
    public void stop(){
        drive.mecanumDrive_Cartesian(0.0, 0.0, 0.0, 0.0);
    }
    public void reset(){
        //gyro.reset();
    }
    public void driveWithJoystick(Joystick stick){
        //double angle = gyro.getAngle(); // get current heading
        drive.mecanumDrive_Cartesian(stick.getX(), stick.getY(), stick.getZ(), 0.0 /*-angle*Kp*/);
    }
    
}
