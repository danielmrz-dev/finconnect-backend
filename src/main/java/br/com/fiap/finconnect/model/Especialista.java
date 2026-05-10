package br.com.fiap.finconnect.model;


import jakarta.persistence.*;

@Entity
@Table(name = "TB_ESPECIALISTA")
public class Especialista {

  @Id
  @GeneratedValue(
    strategy = GenerationType.SEQUENCE,
    generator = "SEQ_ESPECIALISTA"
  )
  @SequenceGenerator(
    name = "SEQ_ESPECIALISTA",
    sequenceName = "SEQ_ESPECIALISTA",
    allocationSize = 1
  )
  private Long id;

  private String nome;
  private String email;

  @Column(name = "NR_TELEFONE", nullable = false)
  private String nrTelefone;

  @Column(name = "AREA_ATUACAO_ID", nullable = false)
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