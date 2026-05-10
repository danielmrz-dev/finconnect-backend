package br.com.fiap.finconnect.controller;

import br.com.fiap.finconnect.model.Especialista;
import br.com.fiap.finconnect.service.EspecialistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/especialistas")
public class EspecialistaController {

  @Autowired
  EspecialistaService especialistaService;

  @GetMapping()
  @ResponseStatus(HttpStatus.OK)
  public List<Especialista> listarEspecialistas() {
    return especialistaService.listaEspecialistas();
  }
}
