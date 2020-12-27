import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class SikuliYoutubeTest {

	public static void main(String[] args) throws SikuliException  {
		
		System.setProperty("webdriver.chrome.driver", "D://Core Java Training//Drivers//chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=6IeUEsxCvlQ");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Create a object of screen class - Sikuli
		Screen s = new Screen();
		System.out.println("program complete1");
		Pattern playimg = new Pattern("play.PNG");
		System.out.println("program complete2");
		s.wait(playimg,2000);
		System.out.println("program complete3");
		s.click();
		System.out.println("program complete4");
		s.click();
		System.out.println("program complete5");
		
		
		
	}

}
