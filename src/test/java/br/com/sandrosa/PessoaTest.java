package br.com.sandrosa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTest {

    @Test
    void deveCalcularIdadeCorretamente(){
        Pessoa luciana = new Pessoa("Luciana", LocalDateTime.of(2000,1,1, 15,0,0));
        Assertions.assertEquals(24, luciana.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa luciana = new Pessoa("Luciana", LocalDateTime.of(2000,1,1, 15,0,0));
        Assertions.assertTrue(luciana.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("João", LocalDateTime.of(2010,1,1, 15,0,0));
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }
}
