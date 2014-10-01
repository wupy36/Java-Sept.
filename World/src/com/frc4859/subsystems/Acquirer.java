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
public class Acquirer extends Subsystem {
     Victor takeMotor;

    
    public Acquirer(){
        takeMotor = new Victor(4);
    }    
     public void intake(){
        takeMotor.set(1.0);
    }
    public void outtake(){
        takeMotor.set(-1.0);
    }
    public void stop(){
        takeMotor.set(0.0);
    }
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}