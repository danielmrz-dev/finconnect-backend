package br.com.fiap.finconnect.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transacao {
  private Long id;
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
