package br.com.fiap.finconnect.utilities;

import br.com.fiap.finconnect.model.CategoriaTransacao;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class CategoriaTransacaoConverter implements AttributeConverter<CategoriaTransacao, String> {

  @Override
  public String convertToDatabaseColumn(CategoriaTransacao c) {
    return c == null ? null : c.valor;
  }

  @Override
  public CategoriaTransacao convertToEntityAttribute(String valor) {
    return CategoriaTransacao.fromValor(valor);
  }
}
