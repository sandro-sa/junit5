package br.com.sandrosa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

    @Test
    void validarCenarioDeExcecaoNaTrasnferencia(){

        Conta contaOrigem = new Conta("1234",0);
        Conta contadestino = new Conta("1235",10);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class,() -> transferenciaEntreContas.trasferir(contaOrigem,contadestino, -1));
        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.trasferir(contaOrigem,contadestino, 1));

    }
}
