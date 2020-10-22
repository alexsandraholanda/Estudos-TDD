package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;


@ExtendWith(MockitoExtension.class)
public class MockitoTesteOutrosRecursos {

    @Mock
    List<String> lista;

    @Test
    public void primeiroTesteMockito(){
       Mockito.mock(ArrayList.class);

        Mockito.when( lista.size()).thenReturn(10);
        int size = lista.size();
        Assertions.assertThat(size).isEqualTo(10);

        //Verifica se chamou o metodo;
            //Mockito.verify(lista).size();

        //Verifica quantas vezes o metodo foi chamado. (size())
            //Mockito.verify(lista, Mockito.times(1)).size();

        //Quando espera que um determinado procedimento não tenha sido executado no seu teste.
            //Mockito.verify(lista, Mockito.never()).size();

        //Verifica que os testes foram execultado em uma determinada ordem.
            //InOrder inOrder = Mockito.inOrder(lista);


    }
}
