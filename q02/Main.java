package q02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Integer n1 = Integer.parseInt(sc.nextLine());
            System.out.println("Você digitou: " + n1);
        } catch (NumberFormatException e) {
            System.out.println("Digite um número válido!");
            e.printStackTrace();
        }

        sc.close();
    }
}
