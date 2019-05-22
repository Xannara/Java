package lesson14;

public class AgePersonExeption extends RuntimeException{

    public AgePersonExeption() {
    }

    public AgePersonExeption(String message) {
        super(message);
    }

    public AgePersonExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public AgePersonExeption(Throwable cause) {
        super(cause);
    }

    public AgePersonExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
