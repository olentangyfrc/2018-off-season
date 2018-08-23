package org.usfirst.frc.team4611.robot.subsytems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Mecanum extends Subsystem implements IMecanum{
	
	private Victor frontLeft = new Victor(0);
	private Victor frontRight = new Victor(1);
	private Victor backLeft = new Victor(2);
	private Victor backRight = new Victor(3);
	
	public void moveForward(double speed) {
		frontLeft.set(speed);
		frontRight.set(speed);
		backLeft.set(speed);
		backRight.set(speed);
	}
	
	public void moveBackward(double speed) {
		
	}
	
	@Override
	protected void initDefaultCommand() {
		
	}
	
}
