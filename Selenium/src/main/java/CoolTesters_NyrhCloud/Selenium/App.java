package CoolTesters_NyrhCloud.Selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	public static void main(String[] args) {
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com.mx");
	}
}
