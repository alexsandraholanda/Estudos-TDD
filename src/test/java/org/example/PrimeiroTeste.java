package org.example;

import org.junit.Assert;
import org.junit.Test;

public class PrimeiroTeste {

    @Test
    public void calculaMedia(){

        double nota1 = 10, nota2 = 1;
        double media = (nota1 + nota2)/2;
        Assert.assertEquals(media, 5,5);
    }


    @Test
    public void somaNumeros(){

        int numero1 = 25, numero2 = 75;
        int resultado = numero1 + numero2;
        Assert.assertEquals(resultado, 100);
    }

}