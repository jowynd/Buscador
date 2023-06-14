package br.com.buscador.servicos;

public class Endereco {
    String logradouro;
    String bairro;
    String localidade;
    String uf;
    String ddd;
    String cep;

    public String getLogradouro() {
        return logradouro;
    }

    public String getUf() {
        return uf;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "logradouro='" + logradouro +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + localidade +
                ", uf='" + uf +
                ", ddd='" + ddd +
                ", cep='" + cep +
                '}';
    }

    public String getDdd() {
        return ddd;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getCep() {
        return cep;
    }
}
