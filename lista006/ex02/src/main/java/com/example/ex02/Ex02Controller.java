package com.example.ex02;

import org.springframework.web.bind.annotation.*;

@RestController
public class Ex02Controller {
    @GetMapping("/")
    public String ex2(@RequestParam String nome) {
        return "Olá mundo";
    }

    @GetMapping("/{id}")
    public String exibeId(@PathVariable String id) {
        return "O meu id é: " + id;
    }

    @PostMapping("/jogador")
    public String jogador(@RequestBody Jogador jogador) {
        return "isto é um jogador!" + "Nome: " + jogador.nome + "Clube: " + jogador.clube;
    }
}