package com.zenosys.vinod.junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.zenosys.vinod.TrackingService;

@RunWith(Parameterized.class)
public class ParameterizedTest {

	private static TrackingService trackingService=new TrackingService();
	private int input;
	private int expected;
	
	@Parameters
	public static List<Object []> getData(){
		return Arrays.asList(new Object[][]{
				{5,5},
				{5,10},
				{-12,0},
				{50,50},
				{1,51}
		});
	}
	
	public ParameterizedTest(final int input,final int expected){
		this.input=input;
		this.expected=expected;
		
	}
	
	@Test
	public void ValidatingParameterizedTest(){
		if(input>=0)
			trackingService.addProtein(input);
		else
			trackingService.removeProtein(-input);
		
		assertEquals(expected,trackingService.getTotal());
	}
}
