package org.example;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Calculadora {

    @Test
    public void deveSomarDoisNumeros(){
    CalculadoraParametros calcular = new CalculadoraParametros();
        int numero1 = 10, numero2 = 25;
        int resultado = calcular.somar(numero1,numero2);
            Assertions.assertThat(resultado).isEqualTo(35);
    }

    @Test(expected = RuntimeException.class)
    public void naoDeveSomarNumerosNegativos(){
    CalculadoraParametros calcular = new CalculadoraParametros();
        int numero1 = -15, numero2 = 15;
        calcular.somar(numero1,numero2);
    }

}

class CalculadoraParametros {

    int somar(int numero1, int numero2){

        if (numero1<0 || numero2<0){
            throw new RuntimeException("Não é permitido somar numero negativo.");
        }
        return numero1 + numero2;
    }
}
