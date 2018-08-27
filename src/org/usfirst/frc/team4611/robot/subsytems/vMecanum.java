package org.usfirst.frc.team4611.robot.subsytems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class vMecanum extends Subsystem implements iMecanum{
	
	private Victor frontLeft = new Victor(0);
	private Victor frontRight = new Victor(1);
	private Victor backLeft = new Victor(2);
	private Victor backRight = new Victor(3);
	
	public void moveForward(double speed) {
		frontLeft.set(speed);
		frontRight.set(speed);
		backRight.set(speed);
		backLeft.set(speed);
	}
	
	public void moveBackward(double speed) {
		frontLeft.set(speed);
		frontRight.set(speed);
		backRight.set(speed);
		backLeft.set(speed);
	}
	
	@Override
	protected void initDefaultCommand() {
		
	}
	
}
