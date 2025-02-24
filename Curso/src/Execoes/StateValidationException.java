package Execoes;

public class StateValidationException extends RuntimeException {
    public StateValidationException() {
        super("O estado não localizado");
    }
}
