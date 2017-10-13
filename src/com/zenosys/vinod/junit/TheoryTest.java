package com.zenosys.vinod.junit;

import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import com.zenosys.vinod.TrackingService;

/**
 * This Class is ignored - Not working @Theory
 * @author VPillai
 *
 */
@RunWith(Theories.class)
@Ignore
public class TheoryTest {

	@DataPoints
	public static int[] data(){
		return new int[]{1,5,10,15,20,50};
		//return 100;
	}
	
	@Theory
	public void PositiveValueToAddProteinWillHavePositive(int value){
		TrackingService trackingService=new TrackingService();
		trackingService.addProtein(value);
		
		assertTrue(trackingService.getTotal()>0);
		
	}
}
