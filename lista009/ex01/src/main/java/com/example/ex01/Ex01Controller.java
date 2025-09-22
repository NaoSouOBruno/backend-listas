package com.example.ex01;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

import java.util.Map;

@RestController
@RequestMapping("/api/marcas")
    public class Ex01Controller {
        private RestClient cliente = RestClient.create("https://parallelum.com.br/fipe/api/v1/carros");

        @GetMapping("/{marca}/{modelo}/{ano}")
        public String buscaPorEspecifico(@PathVariable String marca, @PathVariable String modelo, @PathVariable String ano) {
            Map<String, Object> r = cliente.get().uri("/marcas/{marca}/modelos/{modelo}/anos/{ano}", marca, modelo, ano).retrieve().body(Map.class);

            return "Valor: " + r.get("Valor") + "\nMês: " + r.get("MesReferencia");
        }
}
