import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Swipes extends Base {
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();		
		
		//Tap
		TouchAction touchAction = new TouchAction(driver);
		WebElement dateWidgets= driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")");				
		touchAction.tap(tapOptions().withElement(element(dateWidgets))).perform();

		WebElement inline= driver.findElementByAndroidUIAutomator("text(\"2. Inline\")");				
		touchAction.tap(tapOptions().withElement(element(inline))).perform();
		
		WebElement nineHour = driver.findElementByAndroidUIAutomator("new UiSelector().description(\"9\")");
		touchAction.tap(tapOptions().withElement(element(nineHour))).perform();
		
		WebElement minuteFifteen = driver.findElementByAndroidUIAutomator("new UiSelector().description(\"15\")");
		WebElement minuteFortyFive = driver.findElementByAndroidUIAutomator("new UiSelector().description(\"45\")");

		touchAction.longPress(longPressOptions().withElement(element(minuteFifteen))
				.withDuration(ofSeconds(2))).moveTo(element(minuteFortyFive)).release().perform();

		

	}

	
}