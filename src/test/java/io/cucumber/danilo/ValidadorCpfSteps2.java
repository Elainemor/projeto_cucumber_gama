package io.cucumber.danilo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class ValidadorCpfSteps2 {
	
	public WebDriver browser;	
	
	public ValidadorCpfSteps2() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		browser = new ChromeDriver();
	}
				
	@Dado("que eu estou no site da gama {string}")
	public void que_eu_estou_no_site_da_gama(String string) {
		browser.get("https://www.gama.academy/");
	}
	
	@Dado("clico na opcao do botao DEV FULL STACK")
	public void clico_na_opcao_do_botao_DEV_FULL_STACK() {
		try {
		    WebElement input = browser.findElement( By.cssSelector("[class='bt-chamada btc-alt w-button']"));
		    input.click();  
		
		} catch (Exception e) {
			System.out.println("ERRO ACESSOU BOTAO" + e);
		}
	}

	@Entao("devo ver as opcoes")
	public void devo_ver_as_opcoes(io.cucumber.datatable.DataTable dataTable) {

	}	
}
		
		


	