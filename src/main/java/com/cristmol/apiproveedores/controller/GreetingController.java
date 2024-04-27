package com.cristmol.apiproveedores.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class GreetingController {

    @Autowired
    Environment env;

    @CrossOrigin(origins = "http://localhost:52912")
    @GetMapping
    public String greeting(){
        return "Bienvenido_Candidato";
    }

    @CrossOrigin(origins = "http://localhost:52912")
    @GetMapping("/version")
    public String version(){
        return env.getProperty("info.app.version");
    }
}

