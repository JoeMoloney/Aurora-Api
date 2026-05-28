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
    
}
