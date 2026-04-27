package br.com.fiap.finconnect.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public enum CategoriaTransacao {
  RECEITA("Receita"),
  DESPESA("Despesa");

  public final String valor;

  CategoriaTransacao(String valor) {
    this.valor = valor;
  }

  @JsonCreator
  public static CategoriaTransacao fromValor(String texto) {
    if (texto == null) return null;
    return Arrays.stream(values())
      .filter(c -> c.valor.equalsIgnoreCase(texto) || c.name().equalsIgnoreCase(texto))
      .findFirst()
      .orElseThrow(() -> new IllegalArgumentException("Categoria inválida: " + texto));
  }

  @JsonValue
  public String getValor() {
    return valor;
  }
}