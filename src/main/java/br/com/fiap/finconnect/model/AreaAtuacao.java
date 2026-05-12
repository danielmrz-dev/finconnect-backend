package br.com.fiap.finconnect.model;


import jakarta.persistence.*;

@Entity(name = "TB_AREA_ATUACAO")
public class AreaAtuacao {

  @Id
  @GeneratedValue(
    strategy = GenerationType.SEQUENCE,
    generator = "SEQ_AREA_ATUACAO"
  )
  @SequenceGenerator(
    name = "SEQ_AREA_ATUACAO",
    sequenceName = "SEQ_AREA_ATUACAO",
    allocationSize = 1
  )
  private Long id;
  private AreaAtuacaoNome nome;

  public AreaAtuacao(Long id, AreaAtuacaoNome nome) {
    this.id = id;
    this.nome = nome;
  }

  public AreaAtuacao(AreaAtuacaoNome nome) {
    this.nome = nome;
  }

  public AreaAtuacao() {}

  public Long getId() { return id; }
  public AreaAtuacaoNome getNome() { return nome; }
  public void setNome(AreaAtuacaoNome nome) { this.nome = nome; }
}