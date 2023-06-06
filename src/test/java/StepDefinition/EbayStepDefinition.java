package StepDefinition;

import Step.EbayStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class EbayStepDefinition extends EbayStep {

    WebDriver driver;
    EbayStepDefinition ebay;

    public static void main(String[] args) {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new ChromeDriver(chromeOptions);

            // Navigate to Url
            driver.get("https://google.com");
            driver.manage().window().maximize();
    }
    @Dado("Abrir el navegador")
    public void abrir_el_navegador() {
        ebay = new EbayStepDefinition();
       // ebay.findgoogle();

    }



    @Cuando("ingreso a google")
    public void ingreso_a_google() {

    }
    @Entonces("buscar la pagina web ebay")
    public void buscar_la_pagina_web_ebay() {

    }
    @Entonces("seleccionar marca adidas")
    public void seleccionar_marca_adidas() {

    }
    @Entonces("ingresar articulo")
    public void ingresar_articulo() {

    }

    }

