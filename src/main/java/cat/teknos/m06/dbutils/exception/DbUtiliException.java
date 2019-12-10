package cat.teknos.m06.dbutils.exception;

public class DbUtiliException extends RuntimeException {
    public DbUtiliException() {
    }

    public DbUtiliException(String message) {
        super(message);
    }

    public DbUtiliException(String message, Throwable cause) {
        super(message, cause);
    }

    public DbUtiliException(Throwable cause) {
        super(cause);
    }

    public DbUtiliException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
