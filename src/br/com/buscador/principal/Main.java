package br.com.buscador.principal;

import br.com.buscador.servicos.CepServico;
import br.com.buscador.servicos.Endereco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu cep: ");
        String cep = scanner.nextLine();

        Endereco endereco = CepServico.buscaEndereco(cep);

        System.out.println(endereco.getBairro());
        System.out.println(endereco.getLocalidade());
        System.out.println(endereco.getLogadouro());
    }

}