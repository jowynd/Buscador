package br.com.buscador.servicos;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CepServico {
    static String servico = "https://viacep.com.br/ws/";
    static int codigo = 200;

    public static Endereco buscaEndereco (String cep) throws Exception {
        String urlDaChamada = servico + cep + "/json";

        try {
            URL url = new URL(urlDaChamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if (conexao.getResponseCode() != codigo) {
                throw new RuntimeException("Erro no código http: " + conexao.getResponseCode());

                BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
                String jsonFormatoString = Converte.converteJsonEmString(resposta);

                Gson gson = new Gson();
                Endereco endereco = gson.fromJson(jsonFormatoString,Endereco.class);

                return endereco;
            }
        } catch (Exception e) {
             throw new Exception("ERRO: " + e);
        }

        finally {
            System.out.println("Finalizou");
        }
    }
}
