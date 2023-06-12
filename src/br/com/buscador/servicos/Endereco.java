package br.com.buscador.servicos;

public class Endereco {
    String logadouro;
    String bairro;
    String localidade;

    public String getLogadouro() {
        return logadouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    @Override
    public String toString() {
        return "Endereco" +
                "logadouro='" + logadouro +
                ", bairro='" + bairro +
                ", localidade='" + localidade;
    }

    public Endereco() {
        this.logadouro = logadouro;
        this.bairro = bairro;
        this.localidade = localidade;
    }
}
