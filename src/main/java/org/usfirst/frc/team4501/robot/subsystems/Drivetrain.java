package org.usfirst.frc.team4501.robot.subsystems;

import org.usfirst.frc.team4501.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
	public static Drivetrain instance;

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	Talon talon1, talon2, talon3, talon4;
	RobotDrive drive;

	DoubleSolenoid driveSol;


	public Drivetrain() {
		instance = this;

		talon1 = new Talon(RobotMap.TALON_1);
		talon2 = new Talon(RobotMap.TALON_2);

//		driveSol = new DoubleSolenoid(RobotMap.DRIVESOL1, RobotMap.DRIVESOL2);

		drive = new RobotDrive(talon1, talon2);
	}

	public void driveTime(double forward, double rotate) {
		drive.arcadeDrive(-forward, -rotate);
		drive.setSafetyEnabled(false);
	}
	
	public void arcadeDrive(double forward, double rotate) {
		drive.arcadeDrive(forward, rotate);
	}
	
	public void tankDrive(double leftValue, double rightValue) {
		drive.tankDrive(leftValue, rightValue);
	}

	public void initDefaultCommand() {
	}

	public void shiftHigh() {
		driveSol.set(DoubleSolenoid.Value.kForward);
	}

	public void shiftLow() {
		driveSol.set(DoubleSolenoid.Value.kReverse);
	}
	
}
