package joe.aurora.repositories;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import joe.aurora.domains.user.User;
import reactor.core.publisher.Mono;

public interface UserRepository extends R2dbcRepository<User, Long> {
    public Mono<User> findByEmail(String email);
    public Mono<User> findById(Long userId);
    public Mono<User> save(User user);
}
