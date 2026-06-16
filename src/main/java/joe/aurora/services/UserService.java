package joe.aurora.services;

import joe.aurora.domains.user.User;
import joe.aurora.dtos.UserDTO;

public interface UserService {
    public User createUser(UserDTO userDTO);
    public User getUserById(Long userId);
}
