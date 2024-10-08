package br.com.sandrosa;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    void testAddition() {
         Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3), "A soma deve ser 5");
    }

    @Test
    void testDivisionByZero() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.dividir(1, 0), "Divisão por zero deve lançar exceção");
    }
}
