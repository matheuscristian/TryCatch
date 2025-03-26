package q07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Integer n1, n2, n3;
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            n3 = sc.nextInt();

            Double media = (n1 + n2 + n3) / 3d;
            System.out.println("Média: " + media);
        } catch (InputMismatchException e) {
            System.out.println("Digite um número válido!");
            e.printStackTrace();
        }

        sc.close();
    }
}
