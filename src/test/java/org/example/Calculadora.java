package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Calculadora {

    @Test
    public void deveSomarDoisNumeros(){
    CalculadoraParametros calcular = new CalculadoraParametros();
        int numero1 = 10, numero2 = 25;
        int resultado = calcular.somar(numero1,numero2);
            Assertions.assertThat(resultado).isEqualTo(35);
    }

    @Test//(expected = RuntimeException.class)
    public void naoDeveSomarNumerosNegativos(){
    CalculadoraParametros calcularSoma = new CalculadoraParametros();
        int numero1 = -15, numero2 = 15;
        calcularSoma.somar(numero1,numero2);
    }

    @Test
    public void deveSubtrairNumero(){
        CalculadoraParametros calcularSubtracao = new CalculadoraParametros();
        int numero1 = 10, numero2 = 5;
        int resultado = calcularSubtracao.subtrair(numero1,numero2);
        Assertions.assertThat(resultado).isEqualTo(5);
    }

    @Test
    public void deveMultiplicarNumero(){
        CalculadoraParametros calcularMultiplicacao= new CalculadoraParametros();
        int numero1 = 5, numero2 = 5;
        calcularMultiplicacao.multiplicar(numero1,numero2);
    }

    @Test
    public void deveDividirNumero(){
        CalculadoraParametros calcularDivisao = new CalculadoraParametros();
            double numero1 = 5, numero2 = 2;
            double resultado = calcularDivisao.dividir(numero1,numero2);
            Assertions.assertThat(resultado).isEqualTo(2.5);
    }

    @Test//(expected = RuntimeException.class)
    public void naoDeveRealizarDivisaoPorZero(){
        CalculadoraParametros calcularDivisao = new CalculadoraParametros();
            double numero1 = 5,  numero2 = 0;
            calcularDivisao.dividir(numero1,numero2);
    }
}

class CalculadoraParametros {

    int somar(int numero1, int numero2){
        if (numero1<0 || numero2<0){
            throw new RuntimeException("Não é permitido somar numero negativo.");
        }
        return numero1 + numero2;
    }

    int subtrair(int numero1, int numero2){
        return numero1 - numero2;
    }

    int multiplicar(int numero1, int numero2){
        return numero1 * numero2;
    }

    double dividir(double numero1, double numero2){
        if (numero1 == 0 || numero2 ==0){
            throw new RuntimeException("Não foi possivel fazer divisão por zero (0).");
        }
        return numero1/numero2;
    }


}
