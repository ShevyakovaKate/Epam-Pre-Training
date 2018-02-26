package by.epam.preTraining.shevyakova.task6.exceptions;

public class FullStackException extends Exception {
    public FullStackException() {
    }

    public FullStackException(String message) {
        super(message);
    }

    public FullStackException(String message, Throwable cause) {
        super(message, cause);
    }

    public FullStackException(Throwable cause) {
        super(cause);
    }

    public FullStackException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
