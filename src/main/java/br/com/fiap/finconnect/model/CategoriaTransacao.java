package br.com.fiap.finconnect.model;

public enum CategoriaTransacao {
  RECEITA("Receita"),
  DESPESA("Despesa");

  public final String valor;

  CategoriaTransacao(String valor) {
    this.valor = valor;
  }
}