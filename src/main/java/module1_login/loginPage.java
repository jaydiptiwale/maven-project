package module1_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage 
{

	@FindBy(xpath="//input[@id=\"user-name\"]")private WebElement un;
	@FindBy(xpath="//input[@type=\"password\"]")private WebElement pwd;
	@FindBy(xpath="//input[@type=\"submit\"]")private WebElement login;
	
	public loginPage(WebDriver driver){
		PageFactory.initElements(driver,this);;
	}
	public void username(String name) 
	{
	un.sendKeys(name);	
	}
	public void password(String pass) {
		pwd.sendKeys(pass);
	}
	public void loginbutton() 
	{
	login.click();	
	}
}
