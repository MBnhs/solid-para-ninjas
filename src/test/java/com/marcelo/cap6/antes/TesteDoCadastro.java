package com.marcelo.cap6.antes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.assertj.core.api.Assertions.assertThat;


public class TesteDoCadastro {

    private WebDriver driver;


    public TesteDoCadastro(WebDriver driver) {
        this.driver = driver;
    }


    public void testaCadastro() {
        driver.findElement(By.id("nome"))
                .sendKeys("Marcelo");

        driver.findElement(By.id("endereco"))
                .sendKeys("Groovy Street");

        driver.findElement(By.id("btnSubmete")).click();

        String resultado = driver
                .findElement(By.id("resultado"))
                .getText();

        assertThat(resultado).isEqualTo("ok");

    }

}
