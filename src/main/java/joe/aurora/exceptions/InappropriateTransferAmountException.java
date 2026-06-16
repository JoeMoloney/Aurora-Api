package joe.aurora.exceptions;

public class InappropriateTransferAmountException extends RuntimeException {
    public InappropriateTransferAmountException(String message) {
        super(message);
    }
}
