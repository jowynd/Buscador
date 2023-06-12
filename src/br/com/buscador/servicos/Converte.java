package br.com.buscador.servicos;

import java.io.BufferedReader;
import java.io.IOException;

public class Converte {
    public static String converteJsonEmString(BufferedReader buffereReader) throws IOException {
        String resposta, jsonFormatoString = "";
        while ((resposta = buffereReader.readLine()) != null) {
            jsonFormatoString += resposta;
        }
        return jsonFormatoString;
    }
}
