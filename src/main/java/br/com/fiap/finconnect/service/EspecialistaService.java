package br.com.fiap.finconnect.service;

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
}
