package br.com.fiap.finconnect.model;

public class Especialista {
  private Long id;
  private String nome;
  private String email;
  private String nrTelefone;
  private Long areaAtuacaoId;

  public Especialista(Long id, String nome, String email, String nrTelefone, Long areaAtuacaoId) {
    this.id = id;
    this.nome = nome;
    this.email = email;
    this.nrTelefone = nrTelefone;
    this.areaAtuacaoId = areaAtuacaoId;
  }

  public Especialista(String nome, String email, String nrTelefone, Long areaAtuacaoId) {
    this.nome = nome;
    this.email = email;
    this.nrTelefone = nrTelefone;
    this.areaAtuacaoId = areaAtuacaoId;
  }

  public Especialista() {}

  public Long getId() { return id; }
  public String getEmail() { return email; }
  public void setEmail(String email) { this.email = email; }
  public String getNrTelefone() { return nrTelefone; }
  public void setNrTelefone(String nrTelefone) { this.nrTelefone = nrTelefone; }
  public String getNome() { return nome; }
  public void setNome(String nome) { this.nome = nome; }
  public Long getAreaAtuacaoId() { return areaAtuacaoId; }
  public void setAreaAtuacaoId(Long areaAtuacaoId) { this.areaAtuacaoId = areaAtuacaoId; }
}