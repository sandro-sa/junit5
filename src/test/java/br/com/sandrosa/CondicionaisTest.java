package br.com.sandrosa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "SandroAmânciodeSá")
    void validarAlgoSomenteNoUsuarioSAndro(){
        Assertions.assertEquals(10, 5+5);
    }
    @Test
    @DisabledIfEnvironmentVariable(named = "USERNAME", matches = "outroUsuario")
    void validarAlgoSomenteSeUsuarioNaoForSAndro(){
        Assertions.assertEquals(10, 5+5);
    }
    @Test
    @EnabledOnOs(OS.WINDOWS)
    void validarSeEstiverNoWindows(){
        Assertions.assertEquals(10, 5+5);
    }
}
