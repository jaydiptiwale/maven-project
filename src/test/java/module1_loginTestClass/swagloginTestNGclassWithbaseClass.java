package module1_loginTestClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import library_files.BaseClass;
import library_files.utilityclass;
import module1_login.homepage;
import module1_login.loginPage;
import module1_login.logoutpage;

public class swagloginTestNGclassWithbaseClass extends BaseClass
{
	//WebDriver driver;
	Sheet sh;
	homepage obj1;
	loginPage obj2;
	logoutpage obj3;
	int tcid;
	
	@BeforeClass
public void openbrowser() throws EncryptedDocumentException, IOException 
	{
	
		 //driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("https://www.saucedemo.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		initializebrowser();
//FileInputStream file=new FileInputStream("E:\\excel\\Book1.xlsx");
//sh=WorkbookFactory.create(file).getSheet("DDF");
obj1=new homepage(driver);
obj2=new loginPage(driver);
obj3=new logoutpage(driver);
	}
	@BeforeMethod
public void login() throws EncryptedDocumentException, IOException 
{
	obj2.username(utilityclass.getpfdata("UN"));
	obj2.password(utilityclass.getpfdata("PWD"));
	obj2.loginbutton();
}
	@Test
	public void verifylogo() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		tcid=102;
	String actt=obj1.getlogo();
	String exp=utilityclass.getid(0,2);
	Assert.assertEquals(actt, exp,"failed logo text");
	
}
	@AfterMethod
	public void logout(ITestResult s1) throws InterruptedException, IOException 
	{
		if(s1.getStatus()==ITestResult.FAILURE) 
		{
			utilityclass.capturess(driver,tcid);
		}
		obj1.openmenu();
		Thread.sleep(2000);
		obj3.close();
		Thread.sleep(2000);
	}
	@AfterClass
	public void closebrowser() {
		driver.quit();
	}
	
}