package br.com.sandrosa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {

    @Test
    void validarAlgoSomenteNoUsuarioSAndro(){
        String name = System.getenv("USERNAME");
        System.out.println(name);
        Assumptions.assumeTrue(name.equals(System.getenv("USERNAME")));
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    void validarAlgoSomenteSeUsuarioNaoForSAndro(){
        String name = System.getenv("USERNAME");
        Assumptions.assumeFalse("outroUsuario".equals(System.getenv("USERNAME")));
        Assertions.assertEquals(10, 5+5);
    }
}
