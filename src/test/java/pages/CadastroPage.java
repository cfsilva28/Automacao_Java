package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CadastroPage {

	WebDriver driver;

	public final String CAMPO_REGISTER = "//*[@id=\"menuUser\"]";
	public final String NEW_ACCOUNT = "/html/body/login-modal/div/div/div[3]/a[2]";
	public final String USER_NAME = "//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[1]/div/input";

	public CadastroPage(WebDriver driver) {

		this.driver = driver;
	}

	public void AcessoCadastro() {
		driver.findElement(By.xpath(CAMPO_REGISTER)).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NEW_ACCOUNT)));
		driver.findElement(By.xpath(NEW_ACCOUNT)).click();

	}

	public void InfoUser() {
		driver.findElement(By.xpath(USER_NAME)).click();
		driver.findElement(By.xpath(USER_NAME)).sendKeys("cesar2021");

	}

}
