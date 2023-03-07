package Base;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

//	static WebDriver driver;
	private DriverFactory() {

	}

	
	private static DriverFactory instance = new DriverFactory();
	
ThreadLocal <WebDriver> driver= new ThreadLocal <WebDriver>();
	    
	
	public static  DriverFactory getinstance() {
		
		return instance;
		
	}
	
	public void setDriver(WebDriver wDriver) {

		driver.set(wDriver);
//		this.driver=wdriver;

	}

	public  WebDriver getDriver() {

		return  driver.get();
	}

	public void closeBrowser() {
		driver.get().close();
		driver.remove();
	}
}
