package io.cucumber.danilo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;



public class ValidadorCpfSteps3 {
	
	public WebDriver browser;	
	
	public ValidadorCpfSteps3() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		browser = new ChromeDriver();
	}
				
	@Dado("que eu estou no site da gama academy {string}")
	public void que_eu_estou_no_site_da_gama(String string) {
		browser.get("https://pages.gama.academy/curso-de-product-management/");	
	}
	
	@Dado("clico no botao quero fazer tambem")
	public void clico_no_botao_quero_fazer_tambem() {
		try {
		 	System.out.println("QUERO FAZER TAMBEM");	
			WebElement input =  browser.findElement(By.id("lp-pom-button-872"));
		    input.click();	
		} catch (Exception e) {
			System.out.println("ERRO QUERO FAZER TAMBEM" + e);	
		}
	}
	
    @Entao("devo ver o botao quero me matricular")
    public void devo_ver_o_botao_quero_me_matricular() {
    	try {
		 	System.out.println("QUERO ME MATRICULAR");	
			WebElement input =  browser.findElement(By.id("lp-pom-button-883"));		 	
		    input.click();	
		} catch (Exception e) {
			
			System.out.println("ERRO QUERO ME MATRICULAR" + e);	
		}
    }	
}
		
		


	