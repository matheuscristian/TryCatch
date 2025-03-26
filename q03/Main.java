package q03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer n1 = sc.nextInt();

        // ! Não funciona porque Math.sqrt não lança uma excecão, ele retorna NaN quando um argumento inválido é passado
        // try {
        //     System.out.println("Raíz quadrada: " + Math.sqrt(n1));
        // } catch (IllegalArgumentException e) {
        //     System.out.println("Número ilegal.");
        //     e.printStackTrace();
        // }

        Double result = Math.sqrt(n1);
        if (Double.isNaN(result)) {
            System.out.println("Digite um número maior ou igual a zero!");
        } else {
            System.out.println("A raíz quadrada é: " + result);
        }

        sc.close();
    }
}
