package com.goldenmastery.club;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String holaMundo() {
        return "¡Hola Mundo! Este es el Backend Oficial de Java 21 para Golden Mastery Academy cargado desde Spring Initializr con GIT";
    }
}