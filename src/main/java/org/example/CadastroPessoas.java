package org.example;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {

    private List<Pessoa> pessoas;

    public CadastroPessoas() {
        this.pessoas = new ArrayList<>();
    }

    public List<Pessoa> getPessoas() {
        return this.pessoas;
    }

    public void adicionarPessoa(Pessoa pessoa) {
        if (pessoa.getNome() == null){
            throw new pessoaSemNomeNotException();
        }
        this.pessoas.add(pessoa);
    }

    public void remover(Pessoa pessoa) {
        if (this.pessoas.isEmpty()){
            throw new cadastroVazioException();
        }
        this.pessoas.remove(pessoa);
    }
}
