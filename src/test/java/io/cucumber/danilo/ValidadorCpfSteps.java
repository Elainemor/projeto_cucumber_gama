package io.cucumber.danilo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;


public class ValidadorCpfSteps {
	
	public WebDriver browser;	
	
	public ValidadorCpfSteps() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		browser = new ChromeDriver();
	}
				
	@Dado("que acesso o site da gama academy {string}")
	public void que_acesso_o_site_da_gama_academy (String string) {
		browser.get("https://www.gama.academy/");
	}
	
	@Dado("clico na opcao quem somos")
	public void clico_na_opcao_quem_somos() {
		try {
			  	System.out.println("ACESSOU ");	
				WebElement input =  browser.findElement(By.cssSelector("[class='nav-link nav w-nav-link']"));
			    //WebElement input2 = browser.findElement(By.linkText("Quem somos"));
			    input.click();	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERRO " + e);	
		}
	}	
	
	@Entao("devo ver o item do manifesto")
	public void devo_ver_o_item_do_manifesto() {
		browser.get("https://www.gama.academy/sobre");
	}		
}
		


	