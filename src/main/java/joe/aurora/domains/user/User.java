package joe.aurora.domains.user;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String email;
    private String passwordHash;
    private LocalDateTime createdAt;
}
