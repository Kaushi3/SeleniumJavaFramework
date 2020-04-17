package demo;

import org.testng.annotations.Test;

@Test(groups= {"Allclass"})
public class TestNGGropsDemo {

	

	@Test(groups = {"sanity"})
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(groups = {"windows.regression"})
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(groups = {"linux.regression"})
	public void test3() {
		System.out.println("test3");
	}
	
	@Test
	public void test4() {
		System.out.println("test4");
	}
}
