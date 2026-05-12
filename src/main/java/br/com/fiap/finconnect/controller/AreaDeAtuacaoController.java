package br.com.fiap.finconnect.controller;

import br.com.fiap.finconnect.model.AreaAtuacao;
import br.com.fiap.finconnect.service.AreaDeAtuacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/areas-especialistas")
public class AreaDeAtuacaoController {

  @Autowired
  AreaDeAtuacaoService areaDeAtuacaoService;

  @GetMapping()
  @ResponseStatus(HttpStatus.OK)
  public List<AreaAtuacao> listarAreasDeAtuacao() {
    return areaDeAtuacaoService.listaAreasDeAtuacao();
  }

  @PostMapping()
  @ResponseStatus(HttpStatus.CREATED)
  public AreaAtuacao criarNovaAreaDeAtuacao(@RequestBody AreaAtuacao novaArea) {
    return areaDeAtuacaoService.registrarAreaDeAtuacao(novaArea);
  }
}
