package br.com.fiap.finconnect.model;

public enum AreaAtuacaoNome {

  INVESTIMENTOS("Investimentos"),
  PLANEJAMENTO_FINANCEIRO("Planejamento Financeiro"),
  CONSORCIOS("Consórcios"),
  GESTAO_DE_RISCOS("Gestão de Riscos"),
  PLANEJAMENTO_TRIBUTARIO("Planejamento Tributário"),
  PLANEJAMENTO_APOSENTADORIA("Planejamento de Aposentadoria"),
  PLANEJAMENTO_SUCESSORIO("Planejamento Sucessório");

  private final String label;

  AreaAtuacaoNome(String label) {
    this.label = label;
  }

  public String getLabel() {
    return label;
  }
}