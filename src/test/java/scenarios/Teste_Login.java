package scenarios;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pages.CadastroPage;

public class Teste_Login {

	static ChromeDriver driver;

	CadastroPage register = new CadastroPage(driver);

	@BeforeClass
	public static void beforeClass() {
		driver = setupChromeDriver();
		driver.get("http://advantageonlineshopping.com/#/");
	}
	
	@Test

	public void cadastro() {
		
		register.InformacoesDeCadastro();

	}

	public static ChromeDriver setupChromeDriver() {

		ChromeOptions chromeOptions = new ChromeOptions();
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;

	}

}
