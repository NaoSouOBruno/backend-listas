package com.example.ex01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex01Controller {
    @GetMapping("/")
    public String ex01(@RequestParam String clima, String estilo) {

        if (clima.equals("calor") && estilo.equals("natureza")) {
            return "Rio de Janeiro";
        }
        if (clima.equals("calor") && estilo.equals("cidade")) {
            return "São Paulo";
        }
        if (clima.equals("frio") && estilo.equals("natureza")) {
            return "Rio Grande do Sul";
        }
        if (clima.equals("frio") && estilo.equals("cidade")) {
            return "Santa Catarina";
        }
        else {
            return clima + estilo;
        }
    }
}