package Testing;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
public void onTestStart(ITestResult result) {
}
public void onTestSuccess(ITestResult result) {
}
public void onTestFailure(ITestResult result) {
System.out.println("Test failed - screenshot captured");
}
public void onTestSkipped(ITestResult result) {
}
public void onTestFailedButWithinSuccessPercentage(ITestResult resut) {
}

}