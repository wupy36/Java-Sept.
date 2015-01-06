/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frc4859.commands.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author Andy
 */
public class DRFAOT extends CommandGroup {
    
    public DRFAOT() {
        //addSequential(new Gyro(0.01));
        addSequential(new DriveStraight(2.5));
        addSequential(new OutPut(3));
        addSequential(new Stop(1));
        //addSequential(new Stop(1));
        //addSequential(new Turn(1));
        //addSequential(new DriveStraight(1));
        //addSequential(new Turn(1));
        //addSequential(new DriveStraight(1));
        //addSequential(new Turn(1));
        //addSequential(new DriveStraight(1));
        //addSequential(new Turn(1));
    
    }
}
