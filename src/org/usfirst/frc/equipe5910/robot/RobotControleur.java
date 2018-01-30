package org.usfirst.frc.equipe5910.robot;

import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.IterativeRobot;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotControleur extends IterativeRobot {
	
	CANTalon tourellePan;
	public static final int TOURELLE_PAN_MOTEUR = 2;
	
	public static final double TOURELLE_PAN_LIMITE_MINIMUM = -995;
	public static final double TOURELLE_PAN_LIMITE_MAXIMUM = -30;
	
	public static final double PAN_KP = 50;
	public static final double PAN_KI = 0.0008;

	//CANTalon tourelleTilt;
	//public static final int TOURELLE_TILT_MOTEUR = 5;
	
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 * 
	 */
	@Override
	public void robotInit() {
		System.out.println("robotInit()");
		
		tourellePan = new CANTalon(TOURELLE_PAN_MOTEUR);
		
		tourellePan.setFeedbackDevice(CANTalon.FeedbackDevice.AnalogPot);
		tourellePan.setPID(PAN_KP, PAN_KI, 0);
		tourellePan.setControlMode(0);
		tourellePan.setPosition(0);
		tourellePan.enable();
		tourellePan.setForwardSoftLimit(TOURELLE_PAN_LIMITE_MAXIMUM);
		tourellePan.enableForwardSoftLimit(true);
		tourellePan.setReverseSoftLimit(TOURELLE_PAN_LIMITE_MINIMUM);
		tourellePan.enableReverseSoftLimit(true);
		tourellePan.reverseSensor(true);
		
		//tourelleTilt = new CANTalon(TOURELLE_TILT_MOTEUR);
	}

	/**
	 * This function is run once each time the robot enters autonomous mode
	 */
	@Override
	public void autonomousInit() {
		System.out.println("autonomousInit()");
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		System.out.println("autonomousPeriodic()");
	}

	/**
	 * This function is called once each time the robot enters tele-operated
	 * mode
	 */
	@Override
	public void teleopInit() {
		System.out.println("teleopInit()");
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		System.out.println("teleopPeriodic()");
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		System.out.println("testPeriodic()");
	}
	
	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testInit() {
		System.out.println("testInit()");
	}
	
}
