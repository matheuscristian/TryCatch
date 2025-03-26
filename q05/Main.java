package q05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] array = {1, 2, 3, 4, 5};
        Integer   index = sc.nextInt();

        try {
            System.out.println(array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index inválido!");
            e.printStackTrace();
        }

        sc.close();
    }
}
