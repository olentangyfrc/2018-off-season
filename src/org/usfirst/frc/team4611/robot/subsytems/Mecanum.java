package org.usfirst.frc.team4611.robot.subsytems;

import edu.wpi.first.wpilibj.command.Subsystem;

public abstract class Mecanum extends Subsystem implements iMecanum{

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
	public abstract void move(double speed);

}
