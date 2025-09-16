package com.example.ex01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Ex01Controller {
    ArrayList<Jogador> jogadores = new ArrayList<Jogador>();


    @GetMapping("/")
    public String Ex01() {
        System.out.println("aaa");
        return "teste: " + jogadores.get(0).nome;
    }
    @GetMapping("/principal")
    public ArrayList<Jogador> exibirPrincipal() {

        jogadores.add(new Jogador("BPrincipal", "Zagueiro", 19));
        jogadores.add(new Jogador("CPrincipal", "Zagueiro", 19));
        jogadores.add(new Jogador("DPrincipal", "Zagueiro", 19));
        jogadores.add(new Jogador("EPrincipal", "Zagueiro", 19));
        jogadores.add(new Jogador("FPrincipal", "Zagueiro", 19));
        jogadores.add(new Jogador("GPrincipal", "Zagueiro", 19));
        jogadores.add(new Jogador("HPrincipal", "Zagueiro", 19));
        jogadores.add(new Jogador("IPrincipal", "Zagueiro", 19));
        jogadores.add(new Jogador("JPrincipal", "Zagueiro", 19));
        jogadores.add(new Jogador("AReserva", "Zagueiro", 19));
        jogadores.add(new Jogador("BReserva", "Zagueiro", 19));
        jogadores.add(new Jogador("CReserva", "Zagueiro", 19));
        jogadores.add(new Jogador("DReserva", "Zagueiro", 19));
        jogadores.add(new Jogador("EReserva", "Zagueiro", 19));
        jogadores.add(new Jogador("FReserva", "Zagueiro", 19));
        jogadores.add(new Jogador("GReserva", "Zagueiro", 19));
        jogadores.add(new Jogador("HReserva", "Zagueiro", 19));
        jogadores.add(new Jogador("IReserva", "Zagueiro", 19));
        jogadores.add(new Jogador("JReserva", "Zagueiro", 19));

        ArrayList<Jogador> principais = new ArrayList<Jogador>();

        return jogadores;
    }
}