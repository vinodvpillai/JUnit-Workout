package com.zenosys.vinod.junit;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import com.zenosys.vinod.InvalidGoalException;
import com.zenosys.vinod.TrackingService;

public class TrackingServiceTest {

	TrackingService trackingService;

	@Before
	public void set() {
		trackingService = new TrackingService();
	}

	/**
	 * Rules - Expected
	 * 1. Exception
	 * 2. Exception Message 
	 * 
	 * Pending:
	 * 1. @ClassRule
	 * 2. 
	 * 
	 */
	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	@Test
	public void WhenGoalSetLessThanZeroExceptionThrownUsingRule() {

		expectedException.expect(InvalidGoalException.class);
		expectedException.expectMessage("Goal less than 0");
		trackingService.setGoal(0);
	}
	
	/**
	 * Timeout rule will automatically get Applied to all methods. 
	 */
	@Rule
	public Timeout timeOut=new Timeout(2000);

	
	/**
	 * assertThat - is and assertThan - allOf
	 */
	@Test
	@Category(FirstCategory.class)
	public void WhenAddingProteinTotalIncreaseByAmountUsingAssertThat() {
		trackingService.addProtein(10);
		// assertEquals(10,trackingService.getTotal());
		assertThat(trackingService.getTotal(), is(10));
		assertThat(trackingService.getTotal(),
				allOf(is(10), instanceOf(Integer.class)));
	}
	
	/**
	 * Multiple Category
	 */
	@Test
	@Category({ FirstCategory.class, SecondCategory.class })
	public void NewTackingServiceTotalIsZero() {
		assertEquals(0, trackingService.getTotal());
	}

	@Test
	@Category(FirstCategory.class)
	public void WhenAddingProteinTotalIncreaseByAmountAssert() {
		trackingService.addProtein(10);
	}

	/**
	 * Standard Exception
	 */
	@Test(expected = InvalidGoalException.class)
	@Category(FirstCategory.class)
	public void WhenGoalSetLessZeroExcpetionIsThrown() {
		trackingService.setGoal(0);
	}

	/**
	 * Timeout
	 */
	@Test(timeout = 20000)
	@Category(FirstCategory.class)
	public void BadTest() {
		for (int i = 0; i < 100000; i++) {
			trackingService.addProtein(10);
		}
	}

	// @Test
	// @Ignore
	// public void WhenAddingProteinTotalIncreaseByAmount(){
	// trackingService.addProtein(10);
	// assertEquals(10,trackingService.getTotal());
	// }

	// @After
	// public void tearDown(){
	// System.out.println("@After Method");
	// }

	// @BeforeClass
	// public static void beforeClass(){
	// System.out.println("@BeforeClass Method");
	// }
	//
	// @AfterClass
	// public static void afterClass(){
	// System.out.println("@AfterClass Method");
	// }
}
