package joe.aurora.repositories;

import java.util.Optional;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import joe.aurora.domains.user.User;

public interface UserRepository extends R2dbcRepository<User, Long> {
    public Optional<User> findByEmail(String email);
}
