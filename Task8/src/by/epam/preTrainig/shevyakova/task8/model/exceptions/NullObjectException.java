package by.epam.preTrainig.shevyakova.task8.model.exceptions;

public class NullObjectException extends Exception {
    public NullObjectException() {
    }

    public NullObjectException(String message) {
        super(message);
    }

    public NullObjectException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullObjectException(Throwable cause) {
        super(cause);
    }

    public NullObjectException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
