package com.zenosys.vinod.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TrackingServiceTest.class,SecondSuiteTest.class})
public class SuiteTest {

} 
