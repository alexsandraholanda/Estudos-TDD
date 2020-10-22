package org.example;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class CalculadoraRefatorada {
    CalculadoraOpcao calcular;
    int numero1 = 10, numero2 = 10, numero3 = -5, numero4 = 0;

    @BeforeEach
    public void setUp() {
        calcular = new CalculadoraOpcao();
    }

    @Test
    public void deveSomarDoisNumeros() {
        int resultado = calcular.somar(numero1, numero2);
        Assertions.assertThat(resultado).isEqualTo(20);
    }

    @Test
    public void NaoDeveSomarDoisNumeros() {
        org.junit.jupiter.api.Assertions
                .assertThrows(RuntimeException.class,
                        () -> calcular.somar(numero1, numero3));
    }

    @Test
    public void deveSubtrairDoisNumeros() {
        int resultado = calcular.subtracao(numero1, numero2);
        Assertions.assertThat(resultado).isEqualTo(0);
    }

    @Test
    public void deveMultiplicarDoisNumeros() {
        int resultado = calcular.multiplicao(numero1, numero2);
        Assertions.assertThat(resultado).isEqualTo(100);
    }

    @Test
    public void deveDividirDoisNumeros() {
        float resultado = calcular.divisao(numero1, numero2);
        Assertions.assertThat(resultado).isEqualTo(1);
    }

    @Test
    public void NaoDeveDividirNumerosPorZero() {
        org.junit.jupiter.api.Assertions
                .assertThrows(RuntimeException.class,
                        () -> calcular.divisao(numero1, numero4));
    }

}

class CalculadoraOpcao {
    int somar(int numero1, int numero2) {
        if (numero1 < 0 || numero2 <0){
            throw new RuntimeException("Não pode somar numeros negativos.");
        }
        return numero1 + numero2;
    }

    int subtracao(int numero1, int numero2) {
        return numero1 - numero2;
    }

    int multiplicao(int numero1, int numero2) {
        return numero1 * numero2;
    }

    int divisao(int numero1, int numero2) {
        if (numero1 == 0 || numero2 == 0) {
            throw new RuntimeException("Não pode haver divisao por zero");
        }
        return numero1 / numero2;
    }
}
