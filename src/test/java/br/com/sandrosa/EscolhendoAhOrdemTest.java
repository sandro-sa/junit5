package br.com.sandrosa;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.MethodName.class) // Roda os testes respeitando a ordem alfabética dos métodos
//@TestMethodOrder(MethodOrderer.Random.class) // Roda os testes aleatóriamente
//@TestMethodOrder(MethodOrderer.DisplayName.class) // Roda os testes respeitando a ordem alfabética da annotation @DisplayName("A")
public class EscolhendoAhOrdemTest {

    //@DisplayName("A")
    @Order(4)
    @Test
    void validaFluxoA(){

    }
    //@DisplayName("B")
    @Order(3)
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);
    }
    //@DisplayName("C")
    @Order(1)
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);
    }
    //@DisplayName("D")
    @Order(2)
    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true);
    }
}
