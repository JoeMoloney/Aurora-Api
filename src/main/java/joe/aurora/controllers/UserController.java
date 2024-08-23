package joe.aurora.controllers;

import jakarta.servlet.http.HttpServletRequest;
import joe.aurora.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/getUserById")
    public Mono<ResponseEntity<?>> getUserById(@RequestParam Long userId, HttpServletRequest httpServletRequest) {
        return userService.getUserById(userId, httpServletRequest)
                .map(response -> ResponseEntity.ok().body(response));
    }
}
