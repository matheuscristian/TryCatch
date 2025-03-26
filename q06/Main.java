package q06;

import java.util.Scanner;

import q06.Sistema.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String   nome = sc.nextLine();
        Integer idade = sc.nextInt();

        try {
            new GerenciadorDeContas(nome, idade);
            System.out.println("Conta criada com sucesso!");
        } catch (DadosInvalidosException e) {
            System.out.println("Não foi possível criar a conta!");
            e.printStackTrace();
        }

        sc.close();
    }
}
