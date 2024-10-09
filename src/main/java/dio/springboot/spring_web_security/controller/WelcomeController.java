package dio.springboot.spring_web_security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome() {
        return "Bem vindo ao Springboot Web Security.";
    }
    @GetMapping("/users")
    public String users() {
        return "Usuario autorizado.";
    }
    @GetMapping("/managers")
    public String managers() {
        return "Gerencia autorizado.";
    }
}
