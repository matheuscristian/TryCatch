package q04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Integer n1, n2;
            n1 = sc.nextInt();
            n2 = sc.nextInt();

            System.out.println("A soma é: " + (n1 + n2));
        } catch (InputMismatchException e) {
            System.out.println("Digite um número válido!");
            e.printStackTrace();
        }

        sc.close();
    }
}
