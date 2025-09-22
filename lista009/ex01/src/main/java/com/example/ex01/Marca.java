package com.example.ex01;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Marca {
    @JsonProperty("codigo")
    private String codigo;
    @JsonProperty("nome")
    private String nomeCompleto;
}
