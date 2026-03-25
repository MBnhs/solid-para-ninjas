package com.marcelo.cap6.refactor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TesteComSelenium {

    protected WebDriver driver;

    public TesteComSelenium(WebDriver driver) {
        this.driver = driver;
    }

    public void preenche(String id, String valor) {
        driver.findElement(By.id(id)).sendKeys(valor);
    }

    public void submete(String id) {
        driver.findElement(By.id(id)).click();
    }

    public String conteudo(String id) {
        return driver.findElement(By.id(id)).getText();
    }
}
