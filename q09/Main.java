package q09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Double    celsius = sc.nextDouble();
            Double fahrenheit = converterTemperatura(celsius);

            System.out.println("A temperatura em fahrenheit é: " + fahrenheit);
        } catch (Exception e) {
            System.out.println("Não foi possível fazer a conversão!");
            e.printStackTrace();
        }

        sc.close();
    }

    private static Double converterTemperatura(Double celsius) throws TemperaturaInvalidaException {
        if (celsius < -273.15) {
            throw new TemperaturaInvalidaException();
        }

        return (celsius * 1.8) + 32;
    }
}
