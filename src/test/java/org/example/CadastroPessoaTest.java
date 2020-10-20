package org.example;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CadastroPessoaTest {

    @Test
    public void deveCriarCadastroPessoa(){
        CadastroPessoas cadastro = new CadastroPessoas();
        Assertions.assertThat(cadastro.getPessoas()).isEmpty();
    }

    @Test
    public void deveAdicionarUmaPessoa(){
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Alexsandra");

        cadastroPessoas.adicionarPessoa(pessoa);

        Assertions.assertThat(cadastroPessoas.getPessoas())
                .isNotEmpty()
                .hasSize(1)
                .contains(pessoa);
    }

    @Test(expected = pessoaSemNomeNotException.class)
    public void deveAdicionarPessoaNomeVazio(){
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();
        cadastroPessoas.adicionarPessoa(pessoa);

    }
    @Test
    public void deveRemoverUmaPessoa(){
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Alexsandra");
        cadastroPessoas.adicionarPessoa(pessoa);
        cadastroPessoas.remover(pessoa);
        Assertions.assertThat(cadastroPessoas.getPessoas()).isEmpty();

    }

    @Test(expected = cadastroVazioException.class)
    public void deveLancarErroAoRemoverPessoaInexistente(){
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();
        cadastroPessoas.remover(pessoa);
    }

}
