package br.com.fiap.finconnect.utilities;

import br.com.fiap.finconnect.model.AreaAtuacaoNome;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.util.Arrays;

@Converter(autoApply = true)
public class AreaAtuacaoNomeConverter implements AttributeConverter<AreaAtuacaoNome, String> {

  @Override
  public String convertToDatabaseColumn(AreaAtuacaoNome attribute) {
    if (attribute == null) return null;
    return attribute.getLabel();
  }

  @Override
  public AreaAtuacaoNome convertToEntityAttribute(String dbData) {
    if (dbData == null) return null;
    return Arrays.stream(AreaAtuacaoNome.values())
      .filter(e -> e.getLabel().equals(dbData))
      .findFirst()
      .orElseThrow(() -> new IllegalArgumentException("Área desconhecida: " + dbData));
  }
}
