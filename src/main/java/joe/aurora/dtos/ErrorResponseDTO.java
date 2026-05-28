package joe.aurora.dtos;

import java.time.LocalDateTime;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ErrorResponseDTO {
    private LocalDateTime timestamp;
    private Integer statusCode;
    private String errorReason;
    private String details;
}
