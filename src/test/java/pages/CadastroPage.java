package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CadastroPage {
	
	WebDriver driver;
	
	public final String CAMPO_REGISTER = "//*[@id=\"menuUser\"]";
	public final String CREATE_NEW_ACCOUNT = "/html/body/login-modal/div/div/div[3]/a[2]";
	
	public CadastroPage(WebDriver driver) {
		
	this.driver = driver;
		
	}
	
	public void InformacoesDeCadastro() {
		driver.findElement(By.xpath(CAMPO_REGISTER)).click();
		driver.findElement(By.xpath(CREATE_NEW_ACCOUNT)).click();
		
	}
	
	

}
