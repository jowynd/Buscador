package br.com.buscador.principal;

import br.com.buscador.GuardaInfo;
import br.com.buscador.servicos.CepServico;
import br.com.buscador.servicos.Endereco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);




            System.out.println("Informe um cep válido : ");
            var cep  = scanner.nextLine();

            Endereco endereco = CepServico.buscaEndereco(cep);
            GuardaInfo guardaInfo = new GuardaInfo();
            guardaInfo.salvadorDeArquivo(endereco);

            System.out.println(endereco.getBairro());
            System.out.println(endereco.getLocalidade());
            System.out.println(endereco.getLogradouro());
            System.out.println(endereco.getUf());
            System.out.println(endereco.getDdd());

    }
        // 30627-205
        // 30110-929
}
