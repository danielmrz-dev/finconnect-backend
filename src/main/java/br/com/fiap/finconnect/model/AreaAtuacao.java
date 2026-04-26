package br.com.fiap.finconnect.model;

public class AreaAtuacao {
  private Long id;
  private String nome;

  public AreaAtuacao(Long id, String nome) {
    this.id = id;
    this.nome = nome;
  }

  public AreaAtuacao(String nome) {
    this.nome = nome;
  }

  public AreaAtuacao() {}

  public Long getId() { return id; }
  public String getNome() { return nome; }
  public void setNome(String nome) { this.nome = nome; }
}