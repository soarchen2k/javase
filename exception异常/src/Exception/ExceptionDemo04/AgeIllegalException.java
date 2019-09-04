package Exception.ExceptionDemo04;

public class AgeIllegalException extends Exception {

    public AgeIllegalException() {
        super();
    }

    public AgeIllegalException(String message) {
        super(message);
    }

    public AgeIllegalException(String message, Throwable cause) {
        super(message, cause);
    }

    public AgeIllegalException(Throwable cause) {
        super(cause);
    }

    public AgeIllegalException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
