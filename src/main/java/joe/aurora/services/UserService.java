package joe.aurora.services;

import com.fasterxml.jackson.databind.JsonNode;
import joe.aurora.domains.user.User;
import org.springframework.http.server.reactive.ServerHttpRequest;
import reactor.core.publisher.Mono;

public interface UserService {

    Mono<JsonNode> addUser(User user, ServerHttpRequest serverHttpRequest);
    Mono<JsonNode> getAllUsers(ServerHttpRequest serverHttpRequest);
    Mono<JsonNode> getUserById(Long userId, ServerHttpRequest serverHttpRequest);
}
