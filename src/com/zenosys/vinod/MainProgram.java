package com.zenosys.vinod;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

import com.zenosys.vinod.junit.TrackingServiceTest;

public class MainProgram {

	public static void main(final String[] args) {
		//System.out.println("Main Program");
		
		/** 
		 * Try to run the Test from the Program
		 * 
		 */
		JUnitCore junitCore=new JUnitCore();
		//By adding the Listener it will make all the output to the Console
		junitCore.addListener(new TextListener(System.out));
		junitCore.run(TrackingServiceTest.class);
	 }

}
