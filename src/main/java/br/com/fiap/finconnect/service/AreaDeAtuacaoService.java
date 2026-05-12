package br.com.fiap.finconnect.service;

import br.com.fiap.finconnect.model.AreaAtuacao;
import br.com.fiap.finconnect.model.AreaAtuacaoNome;
import br.com.fiap.finconnect.repository.AreaDeAtuacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class AreaDeAtuacaoService {

  @Autowired
  private AreaDeAtuacaoRepository areaDeAtuacaoRepository;

  public List<AreaAtuacao> listaAreasDeAtuacao() {
    List<AreaAtuacao> lista = areaDeAtuacaoRepository.findAll();
    lista.sort(Comparator.comparing(AreaAtuacao::getId));
    return lista;
  }

  public AreaAtuacao registrarAreaDeAtuacao(AreaAtuacao novaArea) {
    return areaDeAtuacaoRepository.save(novaArea);
  }

  public Optional<AreaAtuacao> buscarAreaPorId(Long id) {
    return areaDeAtuacaoRepository.findById(id);
  }
}
