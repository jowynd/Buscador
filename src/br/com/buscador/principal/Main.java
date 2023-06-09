package br.com.buscador.principal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sair = 1;
        int continuar = 0;
        Scanner scanner = new Scanner(System.in);

       while (continuar == 0) {
           System.out.println("Seja bem vindo! Para continuar, digite seu CEP: ");
           scanner.nextLine();
           System.out.println("Seu CEP é: 55555 ");
           System.out.println("Pressione 1 para sair ou 0 para continuar");
           if (sair == 1) {
               break;
           }
        }

    }

}