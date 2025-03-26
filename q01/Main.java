package q01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer n1, n2;
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        try {
            System.out.println("Divisão: " + (n1 / n2));
        } catch (ArithmeticException e) {
            System.out.println("Não é possível fazer uma divisão por zero.");
            e.printStackTrace();
        }

        sc.close();
    }
}
