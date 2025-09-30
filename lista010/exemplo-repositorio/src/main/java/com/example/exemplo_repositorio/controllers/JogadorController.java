package com.example.exemplo_repositorio.controllers;

import com.example.exemplo_repositorio.models.Jogador;
import com.example.exemplo_repositorio.services.JogadorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    private JogadorService jogadorService;

    public JogadorController(JogadorService jogadorService) {
        this.jogadorService = jogadorService;
    }

    @PostMapping
    public Jogador saveJogador(@RequestBody Jogador jogador) {
        return jogadorService.saveJogador(jogador.getNome(),
                                          jogador.getSobrenome(),
                                          jogador.getPosicao()
                                         );
    }

    @GetMapping
    public List<Jogador> getAllJogador() {
        return jogadorService.getAllJogadores();
    }

    @GetMapping("/{id}")
    public Jogador getJogador(@PathVariable UUID id) {

        return jogadorService.getJogador();

    }
}
