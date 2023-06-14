package br.com.buscador;

import br.com.buscador.servicos.Endereco;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GuardaInfo {
    public void salvadorDeArquivo (Endereco endereco) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

           FileWriter escrita = new FileWriter(endereco.getCep() + ".Json");
            escrita.write(gson.toJson(endereco));
            escrita.close();


    }



}
