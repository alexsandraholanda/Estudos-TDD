package org.example;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class UtilizandoBibliotecaAssertJ {

    @Test
    public void somarDoisNumeros(){
        int num1 = 10, num2 = 40;
        int resultadoSoma = num1 + num2;
        Assertions.assertThat(resultadoSoma).isEqualTo(50);
    }

    
}
