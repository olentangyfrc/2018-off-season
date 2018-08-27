package org.usfirst.frc.team4611.robot.commands;

import org.usfirst.frc.team4611.robot.Robot;
import org.usfirst.frc.team4611.robot.subsytems.iMecanum;

import edu.wpi.first.wpilibj.command.Command;

public class MoveForward extends Command {
	
	MoveForward() {
		
	}
	
	protected void execute() {
		((iMecanum)Robot.mecanum).moveForward(1);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
