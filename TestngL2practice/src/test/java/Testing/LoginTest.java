package Testing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	@BeforeTest
	public void loginintoApplication()
	{
		System.out.println("Login to application");
	}
	@AfterTest
	public void logoutfromApplication()
	{
		System.out.println("Logout from application");
	}
	@BeforeMethod
	public void connectToDB()
	{
		System.out.println("DB Connected");
	}
	@AfterMethod
    public void disconnectedFromDB()
    {
    	System.out.println("Disconnect DB Connected");
    }
	@Test(priority=1, description="This is a login test")
	public void LoginTest()
	
	{
		System.out.println("Login is successful");
	}
	@Test(priority=2, description="This is a logout test")
	public void LogoutTest()
	
	{
		System.out.println("Logout is successful");
	}
}
