package br.com.fiap.finconnect.controller;

import br.com.fiap.finconnect.model.Especialista;
import br.com.fiap.finconnect.service.EspecialistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping("/area")
  @ResponseStatus(HttpStatus.OK)
  public List<Especialista> listarEspecialistasPorArea(@RequestParam Long id) {
    return especialistaService.listaEspecialistasPorArea(id);
  }

  @PostMapping()
  @ResponseStatus(HttpStatus.CREATED)
  public Especialista criarNovoEspecialista(@RequestBody Especialista especialista) {
    return especialistaService.registrarEspecialista(especialista);
  }
}
