package org.example;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CadastroPessoaTest {

    @Test
    public void deveCriarCadastroPessoa(){
        CadastroPessoas cadastro = new CadastroPessoas();
        Assertions.assertThat(cadastro.getPessoas()).isEmpty();
    }

//    @Test
//    public void deveAdicionarUmaPessoa(){
//        CadastroPessoas cadastro = new CadastroPessoas();
//        Pessoa pessoa = new Pessoa();
//        CadastroPessoas.adicionarPessoa(pessoa);
//
//    }
}
