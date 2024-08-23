package joe.aurora.services;

import com.fasterxml.jackson.databind.JsonNode;
import jakarta.servlet.http.HttpServletRequest;
import reactor.core.publisher.Mono;

public interface UserService {

    Mono<JsonNode> getUserById(Long userId, HttpServletRequest httpServletRequest);
}
