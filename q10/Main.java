package q10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Long n = sc.nextLong();
            System.out.println("Fatorial: " + fatorial(n, 0l));
        } catch (Exception e) {
            System.out.println("Não foi possível calcular o fatorial!");
            e.printStackTrace();
        }


        sc.close();
    }

    public static Long fatorial(Long n, Long res) throws NumeroNegativoException, LimiteFatorialExcedidoException {
        if (n < 0) {
            throw new NumeroNegativoException();
        }

        if (n > 20) {
            throw new LimiteFatorialExcedidoException();
        }

        if (n == 0) {
            return res;
        }

        if (res == 0) {
            res = 1l;
        }

        res *= n;
        return fatorial(n-1, res);
    }
}
