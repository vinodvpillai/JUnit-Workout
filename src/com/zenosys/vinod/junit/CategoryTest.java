package com.zenosys.vinod.junit;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(FirstCategory.class)
@ExcludeCategory(SecondCategory.class)
@SuiteClasses({TrackingServiceTest.class,SecondSuiteTest.class})
public class CategoryTest {

}
