package q06.Sistema;

public class DadosInvalidosException extends Exception {
    public DadosInvalidosException() {
        super("Insira um nome e também uma idade maior que zero.");
    }
}
