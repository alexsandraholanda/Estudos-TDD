package org.example;

import org.assertj.core.api.Assertions;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class MockitoTeste {

    @Test
    public void primeiroTesteMockito(){
        List<String> lista = Mockito.mock(ArrayList.class);

        Mockito.when( lista.size()).thenReturn(10);
        int size = lista.size();
        Assertions.assertThat(size).isEqualTo(10);
    }
}
