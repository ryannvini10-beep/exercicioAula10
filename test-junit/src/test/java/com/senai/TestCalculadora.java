package com.senai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    // Anotação para dizer que a função é de teste
    @Test
    void testarSoma() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(3, 2);

        // O método assertEquals compara o resultado esperado com o resultado real
        assertEquals(5, resultado);
    }

    // Função para testar a multiplicação
    @Test
    void testarMult() {
        Calculadora calc = new Calculadora();
        int res = calc.multiplicacao(3, 2);

        assertEquals(6, res);
    }
}