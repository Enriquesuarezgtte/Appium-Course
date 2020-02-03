import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Scroll extends Base {
	
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities(); 
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		// scroll: driver.findElementsByAndroidUiAutomator("new UiSelector().scrollIntoView()");
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
		
	}

}
