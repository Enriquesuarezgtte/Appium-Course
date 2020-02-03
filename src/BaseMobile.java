import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseMobile {

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {

		AndroidDriver<AndroidElement> androidDriver;
		String serverUrl = "http://127.0.0.1:4723/wd/hub";
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		androidDriver = new AndroidDriver<AndroidElement>(new URL(serverUrl), cap);
		androidDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return androidDriver;
	}
}
