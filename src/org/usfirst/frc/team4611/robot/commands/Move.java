package org.usfirst.frc.team4611.robot.commands;

import org.usfirst.frc.team4611.robot.Robot;
import org.usfirst.frc.team4611.robot.subsytems.iMecanum;

import edu.wpi.first.wpilibj.command.Command;

public class Move extends Command {
	
	public double speed;
	
	public Move(double speed) {
		this.speed = speed;
	}
	
	protected void execute() {
		Robot.mecanum.moveForward(speed);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
