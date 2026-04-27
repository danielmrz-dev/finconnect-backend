package br.com.fiap.finconnect.dto;

import br.com.fiap.finconnect.model.CategoriaTransacao;
import java.math.BigDecimal;
import java.time.LocalDate;

public class AtualizarTransacaoRequest {
  private LocalDate data;
  private BigDecimal valor;
  private CategoriaTransacao categoria;
  private String descricao;

  public LocalDate getData() { return data; }
  public void setData(LocalDate data) { this.data = data; }
  public BigDecimal getValor() { return valor; }
  public void setValor(BigDecimal valor) { this.valor = valor; }
  public CategoriaTransacao getCategoria() { return categoria; }
  public void setCategoria(CategoriaTransacao categoria) { this.categoria = categoria; }
  public String getDescricao() { return descricao; }
  public void setDescricao(String descricao) { this.descricao = descricao; }
}
