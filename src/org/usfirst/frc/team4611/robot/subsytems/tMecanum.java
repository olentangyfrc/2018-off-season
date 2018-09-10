package org.usfirst.frc.team4611.robot.subsytems;

import org.usfirst.frc.team4611.robot.OI;
import org.usfirst.frc.team4611.robot.Robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class tMecanum extends Mecanum {
	
	private int maxRPM = 1200;
	
	private WPI_TalonSRX frontLeft = new WPI_TalonSRX(0);
	private WPI_TalonSRX frontRight = new WPI_TalonSRX(1);
	private WPI_TalonSRX backLeft = new WPI_TalonSRX(2);
	private WPI_TalonSRX backRight = new WPI_TalonSRX(3);
	
	private double YVal = -OI.generalJoystickFilter(OI.con.getY()); 
	private double XVal = OI.generalJoystickFilter(OI.con.getX());
	private double ZVal = OI.generalJoystickFilter(OI.con.getX());
	private double velocity1;
	private double velocity2;
	private double velocity3;
	private double velocity4;
	
	private double YValScaler1 = 1;
	private double XValScaler1 = 1;
	private double YValScaler2 = 1;
	private double XValScaler2 = 1;
	private double ZValScaler = 1;
	
	private int velocityInvert1 = 1;
	private int velocityInvert2 = -1;
	private int velocityInvert3 = -1;
	private int velocityInvert4 = 1;

	
	public void moveBackward(double speed) {
		
	}
	
	@Override
	protected void initDefaultCommand() {
		
	}

	@Override
	public void moveForward(double speed) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(double speed) {
		
		velocity1 = 4*(maxRPM * (YVal * YValScaler1 + XVal * XValScaler1 + ZVal * ZValScaler) * (velocityInvert1));
		velocity2 = 4*(maxRPM * (YVal * YValScaler2 - XVal * XValScaler2 - ZVal * ZValScaler) * (velocityInvert2)); 
		velocity3 = 4*(maxRPM * (YVal * YValScaler2 + XVal * XValScaler2 - ZVal * ZValScaler) * (velocityInvert3));
		velocity4 = 4*(maxRPM * (YVal * YValScaler1 - XVal * XValScaler1 + ZVal * ZValScaler) * (velocityInvert4));
		
		frontLeft.set(ControlMode.Velocity, velocity4);
		frontRight.set(ControlMode.Velocity, velocity3);
		backLeft.set(ControlMode.Velocity, velocity1);
		backRight.set(ControlMode.Velocity, velocity2);		
	}
	
}
