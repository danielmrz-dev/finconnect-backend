package br.com.fiap.finconnect.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "TB_TRANSACAO")
public class Transacao {

  @Id
  @GeneratedValue(
    strategy = GenerationType.SEQUENCE,
    generator = "SEQ_TRANSACAO"
  )
  @SequenceGenerator(
    name = "SEQ_TRANSACAO",
    sequenceName = "SEQ_TRANSACAO",
    allocationSize = 1
  )
  private Long id;

  @Column(name = "USUARIO_ID", nullable = false)
  private Long usuarioId;
  private LocalDate data;
  private BigDecimal valor;
  private CategoriaTransacao categoria;

  private String descricao;

  public Transacao(Long id, Long usuarioId, LocalDate data, BigDecimal valor, CategoriaTransacao categoria, String descricao) {
    this.id = id;
    this.usuarioId = usuarioId;
    this.data = data;
    this.valor = valor;
    this.categoria = categoria;
    this.descricao = descricao;
  }

  public Transacao(Long usuarioId, LocalDate data, BigDecimal valor, CategoriaTransacao categoria, String descricao) {
    this.usuarioId = usuarioId;
    this.data = data;
    this.valor = valor;
    this.categoria = categoria;
    this.descricao = descricao;
  }

  public Transacao() {}

  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
  public Long getUsuarioId() { return usuarioId; }
  public void setUsuarioId(Long usuarioId) { this.usuarioId = usuarioId; }
  public LocalDate getData() { return data; }
  public void setData(LocalDate data) { this.data = data; }
  public BigDecimal getValor() { return valor; }
  public void setValor(BigDecimal valor) { this.valor = valor; }
  public CategoriaTransacao getCategoria() { return categoria; }
  public void setCategoria(CategoriaTransacao categoria) { this.categoria = categoria; }
  public String getDescricao() { return descricao; }
  public void setDescricao(String descricao) { this.descricao = descricao; }
}
