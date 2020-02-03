import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Browse extends BaseMobile {
	
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.get("http://facebook.com");
		driver.findElementById("m_login_email").sendKeys("prueba@mail.com"); //  not working 
		driver.findElementByName("pass").sendKeys("123456789"); //  not working
		driver.findElementByXPath("//*[@name='login']").click();	
	}
}
