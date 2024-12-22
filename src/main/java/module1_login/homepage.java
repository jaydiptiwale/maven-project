package module1_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage 
{
	
@FindBy(xpath="//div[text()='Swag Labs']") private WebElement logo;
@FindBy(xpath="(//button[@type=\"button\"])[1]") private WebElement menu;

 public homepage(WebDriver driver)
{
	
	PageFactory.initElements(driver,this);
}
 public String getlogo() 
 {
	String act=logo.getText();
	return act;
 }
 public void openmenu() 
 {

	 menu.click();
}

}