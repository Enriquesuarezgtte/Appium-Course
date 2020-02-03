import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DragAndDrop extends Base {
	
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = capabilities();
		TouchAction touch = new TouchAction(driver);
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("new UiSelector().description(\"Drag and Drop\")").click();
		//long press -move-release
		WebElement firsCircle = driver.findElementsByClassName("android.view.View").get(0);
		WebElement secondCircle = driver.findElementsByClassName("android.view.View").get(1);
		touch.longPress(element(firsCircle)).moveTo(element(secondCircle)).release().perform();
	}

}
