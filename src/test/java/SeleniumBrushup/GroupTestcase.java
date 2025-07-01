package SeleniumBrushup;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupTestcase {
	
	
	@Test(groups = "smoke")
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(groups = "smoke")
	public void test2()
	{
		System.out.println("test2");
	}
	
	@Test(groups = "regression")
	public void test3()
	{
		System.out.println("test3");
	}
	
	@Test(groups = "regression")
	public void test4()
	{
		System.out.println("test4");
	}

}
