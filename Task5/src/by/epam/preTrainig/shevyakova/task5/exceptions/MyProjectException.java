package by.epam.preTrainig.shevyakova.task5.exceptions;

public class MyProjectException extends Exception {

    public MyProjectException() {
    }

    public MyProjectException(String message) {
        super(message);
    }

    public MyProjectException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyProjectException(Throwable cause) {
        super(cause);
    }

    public MyProjectException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
