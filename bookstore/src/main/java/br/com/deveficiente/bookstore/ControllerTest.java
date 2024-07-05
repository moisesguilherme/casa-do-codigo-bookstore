package br.com.deveficiente.bookstore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

    @GetMapping(value = "/")
    public String teste() {
        return "está configurado!";
    }
}
