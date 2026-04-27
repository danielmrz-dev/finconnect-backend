package br.com.fiap.finconnect.controller;


import br.com.fiap.finconnect.dto.AtualizarTransacaoRequest;
import br.com.fiap.finconnect.model.Transacao;
import br.com.fiap.finconnect.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transacoes")
public class TransacaoController {

  @Autowired
  TransacaoService transacaoService;

  @PostMapping()
  @ResponseStatus(HttpStatus.CREATED)
  public Transacao criarTransacao(@RequestBody Transacao novaTransacao) {
    return transacaoService.criarNovaTransacao(novaTransacao);
  }

  @GetMapping()
  @ResponseStatus(HttpStatus.OK)
  public List<Transacao> listaTransacoes() {
    return transacaoService.listaTransacoes();
  }

  @GetMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public Transacao buscaTransacaoPorId(@PathVariable Long id) {
    return transacaoService.buscarTransacaoPorId(id);
  }

  @GetMapping("/usuario/{id}")
  @ResponseStatus(HttpStatus.OK)
  public List<Transacao> buscaTransacaoUsuario(@PathVariable Long id) {
    return transacaoService.buscarTransacoesPorUsuario(id);
  }

  @PutMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public Transacao atualizarTransacao(@PathVariable Long id, @RequestBody AtualizarTransacaoRequest transacaoAtualizada) {
    return transacaoService.atualizarTransacao(id, transacaoAtualizada);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void excluirTransacao(@PathVariable Long id) {
    transacaoService.excluirTransacao(id);
  }

}
