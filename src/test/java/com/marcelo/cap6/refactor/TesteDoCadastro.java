package com.marcelo.cap6.refactor;

import org.assertj.core.api.Assert;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class TesteDoCadastro extends TesteComSelenium {

    public TesteDoCadastro(WebDriver driver) {
        super(driver);
    }

    public void testaCadastro() {

        /*
        Utilizando herança para facilitar a escrita de DSL.
         */

        preenche("nome", "Marcelo");
        preenche("endereco", "Groove Street");

        submete("btnSubmete");

        String resultado = conteudo("resultado");
        assertThat(resultado).isEqualTo("ok");
    }
}
