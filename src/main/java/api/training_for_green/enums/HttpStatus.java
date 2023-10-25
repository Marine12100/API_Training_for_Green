package api.training_for_green.enums;

public enum HttpStatus {
    SERVER_ERROR(500),
    BAD_REQUEST(400),
    NOT_FOUND(404),
    OK(200),
    OK_NO_CONTENT(204);

    private final int value;

    private HttpStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
