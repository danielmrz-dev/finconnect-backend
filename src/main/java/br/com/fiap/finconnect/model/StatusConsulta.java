package br.com.fiap.finconnect.model;

public enum StatusConsulta {
  REALIZADA("Realizada"),
  AGENDADA("Agendada"),
  CANCELADA("Cancelada");

  public final String valor;

  StatusConsulta(String valor) {
    this.valor = valor;
  }

  public static StatusConsulta porValor(String status) {
    for (StatusConsulta statusConsulta : StatusConsulta.values()) {
      if (statusConsulta.valor.equals(status)) {
        return statusConsulta;
      }
    }
    throw new IllegalArgumentException("Status inválido: " + status);
  }
}
