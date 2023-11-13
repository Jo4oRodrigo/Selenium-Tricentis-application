package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MetodoPage {
	WebDriver driver;

	public void abrirNavegador(String site) {
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(site);
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void validarTitle(String titleEsperado) {
		String textTitle = driver.getTitle();
		assertEquals(textTitle, titleEsperado);
	}

	public void print(String nome) throws IOException {
		TakesScreenshot sch = ((TakesScreenshot) driver);
		File srcFile = sch.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./evidencias/" + nome + "./png");
		FileUtils.copyFile(srcFile, destFile);

	}

	public void validarMensagem(By elemento, String textoEsperado) {
		String textoAtual = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, textoAtual);

	}

	public void fecharNavegador() {
		driver.close();
	}
}
