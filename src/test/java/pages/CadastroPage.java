package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CadastroPage {

	WebDriver driver;

	public final String CAMPO_REGISTER = "//*[@id=\"menuUser\"]";

	public final String NEW_ACCOUNT = "/html/body/login-modal/div/div/div[3]/a[2]";
	public final String USER_NAME = "//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[1]/div/input";
	public final String USER_MAIL = "//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[2]/div/input";
	public final String USER_PASSWORD = "//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[1]/div/input";
	public final String USER_PASSWORD_REPPLY = "//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[2]/div/input";
	public final String USER_NAME_FIRST = "//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[1]/div/input";
	public final String USER_NAME_LAST = "//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[2]/div/input";
	public final String USER_NAME_PHONE = "//*[@id=\"formCover\"]/div[2]/div[2]/sec-view/div/input";
	public final String USER_COUNTRY = "//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[1]/div/select";
	public final String USER_COUNTRY_BR = "//option[contains(text(),'Brazil')]";
	public final String USER_CITY = "//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[2]/div/input";
	public final String USER_ADRESS = "//*[@id=\"formCover\"]/div[3]/div[2]/sec-view[1]/div/input";
	public final String USER_STATE = "//*[@id=\"formCover\"]/div[3]/div[2]/sec-view[2]/div/input";
	public final String USER_POSTAL_CODE = "//*[@id=\"formCover\"]/div[3]/div[3]/sec-view/div/input";

	public CadastroPage(WebDriver driver) {

		this.driver = driver;
	}

	public void AcessoCadastro() {

		driver.findElement(By.xpath(CAMPO_REGISTER)).click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException timepage) {
		}

		driver.findElement(By.xpath(NEW_ACCOUNT)).click();

	}

	public void Account_Details() {

		driver.findElement(By.xpath(USER_NAME)).sendKeys("cesar2021");

		driver.findElement(By.xpath(USER_MAIL)).sendKeys("softwaretestesqa@gmail.com");

		driver.findElement(By.xpath(USER_PASSWORD)).sendKeys("Brasileiro@2021");

		driver.findElement(By.xpath(USER_PASSWORD_REPPLY)).sendKeys("Brasileiro@2021");
	}

	public void Personal_Details() {

		driver.findElement(By.xpath(USER_NAME_FIRST)).sendKeys("Cesar");

		driver.findElement(By.xpath(USER_NAME_LAST)).sendKeys("Silva");

		driver.findElement(By.xpath(USER_NAME_PHONE)).sendKeys("011987534907");

	}

	public void Adress() {

		driver.findElement(By.xpath(USER_COUNTRY)).click();

		driver.findElement(By.xpath(USER_COUNTRY_BR)).click();

		driver.findElement(By.xpath(USER_CITY)).sendKeys("Barueri");
		
		driver.findElement(By.xpath(USER_ADRESS)).sendKeys("Rua dos Pombos - 10");
		
		driver.findElement(By.xpath(USER_STATE)).sendKeys("Barueri");
		
		driver.findElement(By.xpath(USER_POSTAL_CODE)).sendKeys("06415-150");

	}

}
