package br.com.sandrosa;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultardadosDePessoaTest {

    //@BeforeAll e @AfterAll execução unica no inicio da class
    @BeforeAll
    static void configurarConexao(){
        BancoDeDados.iniciarConexa0();
    }

    //@BeforeEach e @AfterEach execução antes e depois de cada teste da class
    @BeforeEach
    void insereDadosParaTest(){
        BancoDeDados.insereDados( new Pessoa("Luciana", LocalDateTime.of(2000,1,1, 15,0,0)));
    }

    @AfterEach
    void removeDados(){
        BancoDeDados.removeDados( new Pessoa("Luciana", LocalDateTime.of(2000,1,1, 15,0,0)));
    }

    @Test
    void validarDadosDeRetorno(){
        Assertions.assertNull(null);
    }

    @Test
    void validarDadosDeRetorno2(){
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizouConexa0();
    }
}
