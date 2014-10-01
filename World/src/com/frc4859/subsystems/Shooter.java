/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frc4859.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Andy
 */
public class Shooter extends Subsystem {
    Victor shot1Motor;
    Victor shot2Motor;
    
    public Shooter(){
        shot1Motor = new Victor(2);
        shot2Motor = new Victor(3);  
    }
    public void shoot(){
        shot1Motor.set(1.0);
        shot2Motor.set(1.0);
    }
    public void reverse(){
        shot1Motor.set(-0.25);
        shot2Motor.set(-0.25);
    }
    public void stop(){
        shot1Motor.set(0.0);
        shot2Motor.set(0.0);
    }
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
