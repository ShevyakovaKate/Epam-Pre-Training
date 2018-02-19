package by.epam.preTrainig.shevyakova.task5.exceptions;

public class LogicExeption extends MyProjectException {

    public LogicExeption() {
    }

    public LogicExeption(String message) {
        super(message);
    }

    public LogicExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public LogicExeption(Throwable cause) {
        super(cause);
    }

    public LogicExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
