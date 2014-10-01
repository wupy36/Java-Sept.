/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frc4859.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Andy
 */
public class Lifter extends Subsystem {
    Victor liftMotor;
    DigitalInput limitSwitch;
   
    public void initDefaultCommand() {
        //setDefaultCommand(new Lift());
    }
    
    public Lifter(){
        liftMotor = new Victor(5);
        limitSwitch = new DigitalInput(1);
    }
    public void up(){
        liftMotor.set(-1.0);
    }
    public void down(){
        liftMotor.set(0.25);
    }
    public void stop(){
        liftMotor.set(0.0);
    }
    public boolean getSwitch(){
        return limitSwitch.get();
    }
}
