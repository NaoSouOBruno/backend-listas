package com.example.ex02;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

import java.util.Map;

@RestController
@RequestMapping("/")
public class Ex02Controller {
    private RestClient cliente = RestClient.create("https://api.thecatapi.com/v1/images");

    @GetMapping("/{qtde}")
    public String buscaPorEspecifico(@PathVariable String qtde) {
        return cliente.get().uri("/search?limit={qtde}", qtde).retrieve().body(String.class);

    }
}
