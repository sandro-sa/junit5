package br.com.sandrosa;

//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    void validarLacamentos(){

        int[] primeroLacamentos = {10,20,30,40,50};
        int[] segundoLacamentos = {10,20,30,40,50};

        assertArrayEquals(primeroLacamentos,segundoLacamentos);

    }

    @Test
    void validarSeObjetoEstaNull(){
        Pessoa pessoa = null;
        assertNull(pessoa);

        Pessoa luciana = new Pessoa("Luciana", LocalDateTime.now());
        assertNotNull(luciana);

    }

    @Test
    void validarNumerosDeTiposDiferente(){
        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }
}
