package co.edu.uco.quickjob.api.init.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/v1/user")
public class UserController {

    @GetMapping
    public ResponseEntity<String> sayHelloInSpanish(){
        return new ResponseEntity<>("Hola mis amores", HttpStatus.ACCEPTED);
    }

}
