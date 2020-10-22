package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CadastroPessoaTest {

    @DisplayName("Deve criar o cadastro de pessoa")
    @Test
    public void deveCriarCadastroPessoa(){
        CadastroPessoas cadastro = new CadastroPessoas();
        Assertions.assertThat(cadastro.getPessoas()).isEmpty();
    }

    @DisplayName("Deve adicionar uma pessoa")
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

    @DisplayName("Deve adicionar pessoa sem informação")
    @Test
    public void deveAdicionarPessoaNomeVazio(){
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();
        org.junit.jupiter.api.Assertions
                .assertThrows(pessoaSemNomeNotException.class,
                        () -> cadastroPessoas.adicionarPessoa(pessoa));

    }

    @DisplayName("Deve remover uma pessoa")
    @Test
    public void deveRemoverUmaPessoa(){
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Alexsandra");
        cadastroPessoas.adicionarPessoa(pessoa);
        cadastroPessoas.remover(pessoa);
        Assertions.assertThat(cadastroPessoas.getPessoas()).isEmpty();

    }

    @DisplayName("Deve lançar um erro ao remover pessoa inexistente")
    @Test//(expected = cadastroVazioException.class)
    public void deveLancarErroAoRemoverPessoaInexistente(){
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();

        org.junit.jupiter.api.Assertions
                .assertThrows(cadastroVazioException.class,
                        () -> cadastroPessoas.remover(pessoa));
    }

}
