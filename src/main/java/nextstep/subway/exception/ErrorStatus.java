package nextstep.subway.exception;

public enum ErrorStatus {
    BAD_REQUEST_NAME("[name] is not null or empty"),
    BAD_REQUEST_COLOR("[color] is not null or empty"),
    BAD_REQUEST_DISTANCE("[distacne] must over than 0"),
    BAD_REQUEST_STATION_ID("[station id] must over than 1");
    private String message;

    ErrorStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}