package org.usfirst.frc.team4611.robot.subsytems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class tMecanum extends Mecanum {
	
	private WPI_TalonSRX frontLeft = new WPI_TalonSRX(0);
	private WPI_TalonSRX frontRight = new WPI_TalonSRX(1);
	private WPI_TalonSRX backLeft = new WPI_TalonSRX(2);
	private WPI_TalonSRX backRight = new WPI_TalonSRX(3);

	
	public void moveBackward(double speed) {
		
	}
	
	@Override
	protected void initDefaultCommand() {
		
	}

	@Override
	public void moveForward(double speed) {
		// TODO Auto-generated method stub
		
	}
	
}
