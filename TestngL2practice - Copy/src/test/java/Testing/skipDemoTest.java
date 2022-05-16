package Testing;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skipDemoTest {
	Boolean datasetup=true;
   @Test(enabled=false)
	public void skipTest1()
	{
		System.out.println("skipping this test as it is not complete");
	}
   @Test
   public void skipTest2()
   {
	System.out.println("skipping this test forcefully");
    throw new SkipException("skipping this test");
   }
   @Test

    public void skipTest3()
   {
	System.out.println("skipping this test based on condition");
   if(datasetup=true)
   {
	   System.out.println("Execute the Test");
   }
   else
   {
	   System.out.println("Do not execute further step");
	   throw new SkipException("Do not execute further step");
   }
}
}