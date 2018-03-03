package by.epam.preTraining.shevyakova.task6.exceptions;

public class EmptyElementException extends Exception {

    public EmptyElementException() {
    }

    public EmptyElementException(String message) {
        super(message);
    }

    public EmptyElementException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyElementException(Throwable cause) {
        super(cause);
    }

    public EmptyElementException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
