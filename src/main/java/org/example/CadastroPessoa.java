package org.example;

import java.util.ArrayList;
import java.util.List;

class CadastroPessoas{
    private List<Pessoa> pessoas;

    public CadastroPessoas() {
        this.pessoas = new ArrayList<>();
    }

    public List<Pessoa> getPessoas() {
        return this.pessoas;
    }
}
