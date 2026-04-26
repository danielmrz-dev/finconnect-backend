package br.com.fiap.finconnect.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Consulta {
  private Long id;
  private Long usuarioId;
  private Long especialistaId;
  private LocalDateTime dataHora;
  private StatusConsulta status;
  private String tipoConsulta;
  private BigDecimal nota;

  public Consulta(Long id, Long usuarioId, Long especialistaId, LocalDateTime dataHora, StatusConsulta status, String tipoConsulta, BigDecimal nota) {
    this.id = id;
    this.usuarioId = usuarioId;
    this.especialistaId = especialistaId;
    this.dataHora = dataHora;
    this.status = status;
    this.tipoConsulta = tipoConsulta;
    this.nota = nota;
  }

  public Consulta(Long usuarioId, Long especialistaId, LocalDateTime dataHora, StatusConsulta status, String tipoConsulta, BigDecimal nota) {
    this.usuarioId = usuarioId;
    this.especialistaId = especialistaId;
    this.dataHora = dataHora;
    this.status = status;
    this.tipoConsulta = tipoConsulta;
    this.nota = nota;
  }

  public Consulta() {}

  public Long getId() { return id; }
  public Long getUsuarioId() { return usuarioId; }
  public void setUsuarioId(Long usuarioId) { this.usuarioId = usuarioId; }
  public Long getEspecialistaId() { return especialistaId; }
  public void setEspecialistaId(Long especialistaId) { this.especialistaId = especialistaId; }
  public LocalDateTime getDataHora() { return dataHora; }
  public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }
  public StatusConsulta getStatus() { return status; }
  public void setStatus(StatusConsulta status) { this.status = status; }
  public String getTipoConsulta() { return tipoConsulta; }
  public void setTipoConsulta(String tipoConsulta) { this.tipoConsulta = tipoConsulta; }
  public BigDecimal getNota() { return nota; }
  public void setNota(BigDecimal nota) { this.nota = nota; }
}