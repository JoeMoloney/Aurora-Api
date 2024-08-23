package joe.aurora.services.serviceimpls;

import com.fasterxml.jackson.databind.JsonNode;
import jakarta.servlet.http.HttpServletRequest;
import joe.aurora.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Map;

import static joe.aurora.utilities.UserServiceUtility.getUser;
import static joe.aurora.utilities.WebClientUtility.extractHeaders;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    private final WebClient webClient;

    @Autowired
    public UserServiceImpl(WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    public Mono<JsonNode> getUserById(Long userId, HttpServletRequest httpServletRequest) {
        return webClient.post()
                .uri(getUser)
                .headers(extractHeaders(httpServletRequest))
                .body(BodyInserters.fromValue(Map.of("User", httpServletRequest.getHeader("User"))))
                .retrieve()
                .bodyToMono(JsonNode.class)
                .doOnError(thrown -> log.error("getUser has thrown an error: {}", thrown.getMessage()))
                .doOnSuccess(response -> log.info("getUser has completed successfully: {}", response.toPrettyString()));
    }
}
