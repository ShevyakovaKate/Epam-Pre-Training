package by.epam.preTraining.shevyakova.task6.exceptions;

public class IllegalIndexException extends Exception {
    public IllegalIndexException() {
    }

    public IllegalIndexException(String message) {
        super(message);
    }

    public IllegalIndexException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalIndexException(Throwable cause) {
        super(cause);
    }

    public IllegalIndexException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
