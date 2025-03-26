package q08;

public class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException() {
        super("A idade deve ser maior ou igual a zero.");
    }
}
