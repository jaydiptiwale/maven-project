package library_files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utilityclass 
{

	public static String getid(int row,int cl) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\seleniumMaven\\TestData\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		String value = sh.getRow(row).getCell(cl).getStringCellValue();
		return value;
	}
	public static void capturess(WebDriver driver,int tcid) throws IOException 
	{
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Admin\\eclipse-workspace\\seleniumMaven\\screenshot\\TESTCASEID"+tcid+".jpg");
		FileHandler.copy(src, dest);		
	}
	public static String getpfdata(String key) throws IOException 
	{
	  FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\seleniumMaven\\propertyfile.properties");
	  
	  Properties p=new Properties();
	  p.load(file);
	  
	  String value = p.getProperty(key);
	  return  value;
	}
	
}
