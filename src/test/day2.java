package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	
	@Test(groups={"Smoke"})
	public void ploan()
	{
		System.out.println(" execute last");
		System.out.println("excecuted");
	    System.out.println(" excecuted");
	}
	
	@BeforeTest
	public void prerequiste()
	{
		System.out.println("I will execute first");
		System.out.println("I will execute last");
		System.out.println("secondly excecuted");
	    System.out.println("third excecuted");
	
	
	
	}
}
