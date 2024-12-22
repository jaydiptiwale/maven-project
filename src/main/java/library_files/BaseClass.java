package library_files;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	public WebDriver driver;
public void initializebrowser() throws IOException {

	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(utilityclass.getpfdata("URL"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
}
}
