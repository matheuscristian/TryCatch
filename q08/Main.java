package q08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer idade = sc.nextInt();
        try {
            if (verificarIdade(idade)) {
                System.out.println("É adulto!");
            } else {
                System.out.println("Não é adulto!");
            }
        } catch (IdadeInvalidaException e) {
            System.out.println("Não foi possível verificar a idade!");
            e.printStackTrace();
        }

        sc.close();
    }

    private static Boolean verificarIdade(Integer idade) throws IdadeInvalidaException {
        if (idade < 0) {
            throw new IdadeInvalidaException();
        }

        return idade >= 18;
    }
}
