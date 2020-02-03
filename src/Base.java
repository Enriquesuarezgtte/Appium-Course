import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {

		AndroidDriver<AndroidElement> androidDriver;

		File appDir = new File("src");
		File app = new File(appDir, "ApiDemos-debug.apk");
		String serverUrl = "http://127.0.0.1:4723/wd/hub";

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulatore2");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		cap.setCapability("autoGrantPermissions", "true");

		androidDriver = new AndroidDriver<AndroidElement>(new URL(serverUrl), cap);
		androidDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		return androidDriver;
		
		//AndroidUIAutomator
		
	}

}
