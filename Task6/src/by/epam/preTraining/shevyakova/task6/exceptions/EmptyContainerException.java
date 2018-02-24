package by.epam.preTraining.shevyakova.task6.exceptions;

public class EmptyContainerException extends Exception {
    public EmptyContainerException() {
    }

    public EmptyContainerException(String message) {
        super(message);
    }

    public EmptyContainerException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyContainerException(Throwable cause) {
        super(cause);
    }

    public EmptyContainerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
