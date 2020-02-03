import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Gestures extends Base {
	
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();		
		
		//Tap
		TouchAction touchAction = new TouchAction(driver);
		WebElement expandableList= driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");				
		touchAction.tap(tapOptions().withElement(element(expandableList))).perform();
		WebElement adapter = driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")");				
		touchAction.tap(tapOptions().withElement(element(adapter))).perform();
		WebElement peopleNames = driver.findElementByAndroidUIAutomator("text(\"People Names\")");				
		touchAction.longPress(longPressOptions().withElement(element(peopleNames))
				.withDuration(ofSeconds(2))).release().perform();

	}
}
