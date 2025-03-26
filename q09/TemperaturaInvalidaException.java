package q09;

public class TemperaturaInvalidaException extends Exception {
    public TemperaturaInvalidaException() {
        super("A temperatura não pode ser menor que -273.15 (zero absoluto)");
    }
}
