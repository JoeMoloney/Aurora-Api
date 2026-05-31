package joe.aurora.dtos;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ErrorResponseDTO {
    private LocalDateTime timestamp;
    private HttpStatus statusCode;
    private String errorReason;
    private String details;
    private String uriPath;

    public ErrorResponseDTO(LocalDateTime ldt, HttpStatus httpStatus, String reason, String exceptionMessage, String uri) {
        this.timestamp = ldt;
        this.statusCode = httpStatus;
        this.errorReason = reason;
        this.details = exceptionMessage;
        this.uriPath = uri;
    }
}
