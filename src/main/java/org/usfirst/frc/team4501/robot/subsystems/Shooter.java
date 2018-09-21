package org.usfirst.frc.team4501.robot.subsystems;

import org.usfirst.frc.team4501.robot.RobotMap;
import org.usfirst.frc.team4501.robot.commands.Shoot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	Talon stalon1, stalon2;
	
	RobotDrive shooter;
	
	public Shooter() {
		stalon1 = new Talon(RobotMap.SHOOTERTALON_1);
		stalon2 = new Talon(RobotMap.SHOOTERTALON_2);
		
		shooter = new RobotDrive(stalon1, stalon2);
	}
	
	public void shoot( double leftValue, double rightValue) {
		shooter.tankDrive(-leftValue, -rightValue);
		shooter.setSafetyEnabled(false);
	}
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
  
    }
}

