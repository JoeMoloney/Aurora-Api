package joe.aurora.repositories;

import java.util.Optional;

import joe.aurora.domains.user.User;

public interface UserRepository {
    public Optional<User> findByEmail(String email);
}
