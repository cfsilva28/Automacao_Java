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
	public final String CREATE = "//a[contains(text(),'CREATE NEW ACCOUNT')]";

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

}
