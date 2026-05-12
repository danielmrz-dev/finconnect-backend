package br.com.fiap.finconnect.service;

import br.com.fiap.finconnect.model.AreaAtuacao;
import br.com.fiap.finconnect.model.Especialista;
import br.com.fiap.finconnect.repository.EspecialistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspecialistaService {

  @Autowired
  private EspecialistaRepository especialistaRepository;

  public List<Especialista> listaEspecialistas() {
    return especialistaRepository.findAll();
  }

  public Especialista registrarEspecialista(Especialista novoEspecialista) {
    return especialistaRepository.save(novoEspecialista);
  }

  public List<Especialista> listaEspecialistasPorArea(Long areaId) {
    return especialistaRepository.findEspecialistasByAreaAtuacaoId(areaId);
  }
}
