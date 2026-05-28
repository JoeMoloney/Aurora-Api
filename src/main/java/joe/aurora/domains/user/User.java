package joe.aurora.domains.user;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class User {
    private Long id;
    private String email;
    private String passwordHash;
    private LocalDateTime createdAt;
}
