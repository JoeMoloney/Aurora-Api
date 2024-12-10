package joe.aurora.controllers;

import joe.aurora.domains.user.User;
import joe.aurora.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user/addUser")
    public Mono<ResponseEntity<?>> addUser(@RequestBody User user, ServerHttpRequest serverHttpRequest) {
        log.info("User Object: {}", user.toString());
        return userService.addUser(user, serverHttpRequest)
                .map(response -> ResponseEntity.ok().body(response));
    }

    @GetMapping("/user/getAllUsers")
    public Mono<ResponseEntity<?>> getAllUsers(ServerHttpRequest serverHttpRequest) {
        return userService.getAllUsers(serverHttpRequest)
                .map(response -> ResponseEntity.ok().build());
    }

    @GetMapping("/user/getUserById")
    public Mono<ResponseEntity<?>> getUserById(@RequestParam Long userId, ServerHttpRequest serverHttpRequest) {
        return userService.getUserById(userId, serverHttpRequest)
                .map(response -> ResponseEntity.ok().body(response));
    }
}
