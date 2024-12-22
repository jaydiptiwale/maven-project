package module1_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logoutpage 
{
@FindBy(xpath="//a[@id=\"logout_sidebar_link\"]") private WebElement logout;

public logoutpage(WebDriver driver)
{
	
	PageFactory.initElements(driver, this);
}
public void close() 
{
	logout.click();
}

}
