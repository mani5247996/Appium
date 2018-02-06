package SampleCI;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class intergation implements PageElement{
	AndroidDriver<WebElement> driver;

	public static DesiredCapabilities capabilities;
	public final static int TIMER_WEB_ELE_SHOW = 30;

	public void load() {
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
	}

	@BeforeTest(alwaysRun = true)
	@Parameters({ "port", "device" })
	public void testsetup(String port, String device) throws MalformedURLException {
		String apiKey = System.getenv("TESTOBJECT_API_KEY");
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities = new DesiredCapabilities();
		File appurl = new File("/Users/administrator/Documents/Apk/assured_1_0_1_production_version_code_2.apk");
		capabilities.setCapability("app", appurl.getAbsolutePath());
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device);
	
		capabilities.setCapability(MobileCapabilityType.APP_PACKAGE,"com.assured.singtel.release");
		capabilities.setCapability(MobileCapabilityType.APP_WAIT_ACTIVITY, "com.mteam.mfamily.ui.SplashScreenActivity");
		capabilities.setCapability(MobileCapabilityType.APP_WAIT_ACTIVITY, "com.mteam.mfamily.ui.main.MainActivity");
		driver = new AndroidDriver(new URL("http://localhost:" + port + "/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);

	}

	@Test
	public void login() {
		// Tapping on Agree Button

		load();
		WebElement agreebtn = (new WebDriverWait(driver, TIMER_WEB_ELE_SHOW))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(Second_agree_btn)));
		agreebtn.click();
		/// TAPPING ON ENTER BUTTON
		load();
		WebElement enterField = (new WebDriverWait(driver, TIMER_WEB_ELE_SHOW))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(XPATH_ENTER_BUTTON)));
		enterField.click();
		load();
		// ENTERING THE MOBILE NUMBER
		WebElement entering_mobile_number = (new WebDriverWait(driver, TIMER_WEB_ELE_SHOW))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(XPATH_ENTERING_MOBILE_NUMBER)));
		entering_mobile_number.sendKeys("8184220941");
		load();
		// TAPPING ON PASSSWORD BUTTON
		WebElement tapping_password = (new WebDriverWait(driver, TIMER_WEB_ELE_SHOW))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(XPATH_TAPPING_ON_PASSWORD_BUTTON)));
		tapping_password.click();
		// ENTERING THE PASSSWORD
		WebElement entering_password = (new WebDriverWait(driver, TIMER_WEB_ELE_SHOW))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(XPATH_ENTERING_PASSWORD)));
		entering_password.sendKeys("Welcome1");
		// TAPPING ON COUNTRY CODE
		WebElement country_code = (new WebDriverWait(driver, TIMER_WEB_ELE_SHOW))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(XPATH_TAPPING_ON_COUNTRY_CODE)));
		country_code.click();
		// Selecting country code
		String str = "United States of America";
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ str + "\").instance(0))")
				.click();
		load();
		// TAPPING ON LOGIN BUTTON
		WebElement tapping_login_button = (new WebDriverWait(driver, TIMER_WEB_ELE_SHOW))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(TAPPING_ON_LOGIN_BUTTON)));
		tapping_login_button.click();
		load();
		driver.close();
	}
	@Test
	public void background() throws InterruptedException {
		System.out.println("Device is running in background:");
		long id = Thread.currentThread().getId();
		System.out.println("Current thread count is " + id);
		Thread.sleep(1000);
		driver.sendKeyEvent(3);
		Thread.sleep(1000);
		driver.openNotifications();
		System.out.println("System showing the notifications:");
		System.out.println(" Removing the user testcase.. ");
	}
	@Test
	public void menu_option() {
		load();
		// tapping on cancel button
		MobileElement cancel = (MobileElement) (driver.findElement(By.id(TAPPING_ON_CANCEL_BUTTON)));
		cancel.click();
		// TAPPING ON MENU OPTION BUTTON
		MobileElement tapping_camera = (MobileElement) (driver.findElement(By.id(TAPPING_ON_MENU)));
		tapping_camera.click();
	}

	@Test
	public void login_sec() {
		load();
		load();
		System.out.println("Normal values are needs:");
		WebElement agreebtn = (new WebDriverWait(driver, TIMER_WEB_ELE_SHOW))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(Second_agree_btn)));
		load();
		agreebtn.click();
		/// TAPPING ON ENTER BUTTON
		load();
		WebElement enterField = (new WebDriverWait(driver, TIMER_WEB_ELE_SHOW))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(XPATH_ENTER_BUTTON)));
		enterField.click();
		load();
		// ENTERING THE MOBILE NUMBER
		WebElement entering_mobile_number = (new WebDriverWait(driver, TIMER_WEB_ELE_SHOW))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(XPATH_ENTERING_MOBILE_NUMBER)));
		entering_mobile_number.sendKeys("8184220941");
		load();
		// TAPPING ON PASSSWORD BUTTON
		WebElement tapping_password = (new WebDriverWait(driver, TIMER_WEB_ELE_SHOW))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(XPATH_TAPPING_ON_PASSWORD_BUTTON)));
		tapping_password.click();
		// ENTERING THE PASSSWORD
		WebElement entering_password = (new WebDriverWait(driver, TIMER_WEB_ELE_SHOW))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(XPATH_ENTERING_PASSWORD)));
		entering_password.sendKeys("Welcome1");
		// TAPPING ON COUNTRY CODE
		WebElement country_code = (new WebDriverWait(driver, TIMER_WEB_ELE_SHOW))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(country_code_sec_dev)));
		country_code.click();
		// Selecting country code
		String str = "United States of America";
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ str + "\").instance(0))")
				.click();
		load();
		// TAPPING ON LOGIN BUTTON
		WebElement tapping_login_button = (new WebDriverWait(driver, TIMER_WEB_ELE_SHOW))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(TAPPING_ON_LOGIN_BUTTON)));
		tapping_login_button.click();
		load();
	}

	@Test
	public void creating_menu() {
		// TAPPING ON CIRCULE OPTION
		MobileElement arrow_btn = (MobileElement) (driver.findElement(By.id(ARROW_BTN)));
		arrow_btn.click();
		// TAPPING ON MANAGE CIRCLE OPTION
		load();
		WebElement Manage_cir = (new WebDriverWait(driver, TIMER_WEB_ELE_SHOW))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(MANAGE_CIRCULE_ICON)));
		Manage_cir.click();
		load();
		// Removing the user Remove_btn
		load();
	//	MobileElement Remove_btn_action = (MobileElement) (driver.findElement(By.id(Remove_btn)));
		//Remove_btn_action.click();
		load();
		load();
		// Back btn
		MobileElement Back_btn_action = (MobileElement) (driver.findElement(By.id(Back_btn)));
		Back_btn_action.click();
		MobileElement arrow_btn2 = (MobileElement) (driver.findElement(By.id(ARROW_BTN)));
		arrow_btn2.click();
       //Selecting the cricule
		WebElement selecting_the_cri = (new WebDriverWait(driver, TIMER_WEB_ELE_SHOW))
		.until(ExpectedConditions.elementToBeClickable(By.xpath(Selecting_the_circule)));
		selecting_the_cri.click();
		// verifying the image
	try
	{
		boolean values=driver.findElement(By.xpath(Image_icon)).isDisplayed();
		if (values=true)
		{
		System.out.println("Image is  removed:");
		System.out.println("The value of boolean " + values);
		}
		else
		{
		
		System.out.println("The value of boolean " + values);
		System.out.println("Image is not removed " + values);
		}
	}catch (Exception e) 
	{
		System.out.println("Image is removed:");
	}
			
		
	}

	@Test
	public void second_login() {

		load();
		load();
		System.out.println("Normal values are needs:");
		WebElement agreebtn = (new WebDriverWait(driver, TIMER_WEB_ELE_SHOW))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(Second_agree_btn)));
		load();
		agreebtn.click();
		/// TAPPING ON ENTER BUTTON
		load();
		WebElement enterField = (new WebDriverWait(driver, TIMER_WEB_ELE_SHOW))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(XPATH_ENTER_BUTTON)));
		enterField.click();
		load();
		// ENTERING THE MOBILE NUMBER
		WebElement entering_mobile_number = (new WebDriverWait(driver, TIMER_WEB_ELE_SHOW))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(XPATH_ENTERING_MOBILE_NUMBER)));
		entering_mobile_number.sendKeys("9786104956");
		load();
		// TAPPING ON PASSSWORD BUTTON
		WebElement tapping_password = (new WebDriverWait(driver, TIMER_WEB_ELE_SHOW))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(XPATH_TAPPING_ON_PASSWORD_BUTTON)));
		tapping_password.click();
		// ENTERING THE PASSSWORD
		WebElement entering_password = (new WebDriverWait(driver, TIMER_WEB_ELE_SHOW))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(XPATH_ENTERING_PASSWORD)));
		entering_password.sendKeys("Mani@123");
		// TAPPING ON COUNTRY CODE
		WebElement country_code = (new WebDriverWait(driver, TIMER_WEB_ELE_SHOW))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(country_code_sec_dev)));
		country_code.click();
		// Selecting country code
		String str = "India";
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ str + "\").instance(0))")
				.click();
		load();
		// TAPPING ON LOGIN BUTTON
		WebElement tapping_login_button = (new WebDriverWait(driver, TIMER_WEB_ELE_SHOW))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(TAPPING_ON_LOGIN_BUTTON)));
		tapping_login_button.click();
		load();
	}

	@Test
	public void menu_option_sec() {

		MobileElement cancel = (MobileElement) (driver.findElement(By.id(TAPPING_ON_CANCEL_BUTTON)));
		cancel.click();

	}
}
