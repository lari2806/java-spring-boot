package dio.web.api.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
/*Indica que essa classe é um RestController e
 * alguns dos seus métodos  serão serviços/recursos
 * HTTP
 */
public class WelcomeController {
    @GetMapping
    /*Indica que é um recurso http do tipo get */
    public String welcome(){
        return "Welcome to My Spring Boot Web API";
    }
}
