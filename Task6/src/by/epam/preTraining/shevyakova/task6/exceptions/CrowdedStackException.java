package by.epam.preTraining.shevyakova.task6.exceptions;

public class CrowdedStackException extends Exception {
    public CrowdedStackException() {
    }

    public CrowdedStackException(String message) {
        super(message);
    }

    public CrowdedStackException(String message, Throwable cause) {
        super(message, cause);
    }

    public CrowdedStackException(Throwable cause) {
        super(cause);
    }

    public CrowdedStackException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
