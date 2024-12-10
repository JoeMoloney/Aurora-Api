package joe.aurora.services.serviceimpls;

import com.fasterxml.jackson.databind.JsonNode;
import joe.aurora.domains.user.User;
import joe.aurora.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Map;

import static joe.aurora.utilities.UserServiceUtility.*;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    private final WebClient webClient;

    @Autowired
    public UserServiceImpl(WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    public Mono<JsonNode> addUser(User user, ServerHttpRequest serverHttpRequest) {
        return webClient.post()
                .uri(addUser)
                .body(BodyInserters.fromValue(user))
                .retrieve()
                .bodyToMono(JsonNode.class)
                .doOnError(thrown -> log.error("addUser has thrown an error: {}", thrown.getMessage()))
                .doOnSuccess(response -> log.info("addUser has completed successfully: {}", response.toPrettyString()));
    }

    @Override
    public Mono<JsonNode> getAllUsers(ServerHttpRequest serverHttpRequest) {
        return webClient.get()
                .uri(getAllUsers)
                .retrieve()
                .bodyToMono(JsonNode.class)
                .doOnError(thrown -> log.error("getAllUsers has thrown an error: {}", thrown.getMessage()))
                .doOnSuccess(response -> log.info("getAllUsers has completed successfully: {}", response.toPrettyString()));
    }

    @Override
    public Mono<JsonNode> getUserById(Long userId, ServerHttpRequest serverHttpRequest) {
        return webClient.post()
                .uri(getUser)
                .body(BodyInserters.fromValue(Map.of("User", serverHttpRequest)))
                .retrieve()
                .bodyToMono(JsonNode.class)
                .doOnError(thrown -> log.error("getUser has thrown an error: {}", thrown.getMessage()))
                .doOnSuccess(response -> log.info("getUser has completed successfully: {}", response.toPrettyString()));
    }
}
