package api.training_for_green.exceptions;

public class UserServiceException extends RuntimeException {
    private final Integer statusCode;

    private final String message;

    public UserServiceException(Integer statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public Integer getStatusCode() {
        return statusCode;
    }
}
