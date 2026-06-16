package joe.aurora.services.serviceimpls;

import org.springframework.stereotype.Service;

import joe.aurora.domains.user.User;
import joe.aurora.dtos.UserDTO;
import joe.aurora.repositories.UserRepository;
import joe.aurora.services.UserService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public User createUser(UserDTO userDTO) {
        throw new UnsupportedOperationException("Function not implemented");
    }

    public User getUserById(Long userId) {
        throw new UnsupportedOperationException("Function not implemented");
    }
}
