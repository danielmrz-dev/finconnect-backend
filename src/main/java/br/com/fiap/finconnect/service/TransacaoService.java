package br.com.fiap.finconnect.service;

import br.com.fiap.finconnect.controller.TransacaoController;
import br.com.fiap.finconnect.dto.AtualizarTransacaoRequest;
import br.com.fiap.finconnect.model.Transacao;
import br.com.fiap.finconnect.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransacaoService {

  @Autowired
  private TransacaoRepository transacaoRepository;

  public Transacao criarNovaTransacao(Transacao novaTransacao) {
    return transacaoRepository.save(novaTransacao);
  }

  public List<Transacao> listaTransacoes() {
    return transacaoRepository.findAll();
  }

  public Transacao buscarTransacaoPorId(Long id) {
    Optional<Transacao> transacao = transacaoRepository.findById(id);
    if (transacao.isPresent()) {
      return transacao.get();
    } else {
      throw new RuntimeException("Transação não encontrada!");
    }
  }

  public List<Transacao> buscarTransacoesPorUsuario(Long usuarioId) {
    return transacaoRepository.findByUsuarioId(usuarioId);
  }

  public Transacao atualizarTransacao(Long id, AtualizarTransacaoRequest transacaoAtualizada) {
    Transacao transacaoAtual = transacaoRepository.findById(id)
      .orElseThrow(() -> new RuntimeException("Transação não encontrada."));
    transacaoAtual.setValor(transacaoAtualizada.getValor());
    transacaoAtual.setCategoria(transacaoAtualizada.getCategoria());
    transacaoAtual.setData(transacaoAtualizada.getData());
    transacaoAtual.setDescricao(transacaoAtualizada.getDescricao());
    return transacaoRepository.save(transacaoAtual);
  }

  public void excluirTransacao(Long id) {
    Optional<Transacao> transacao = transacaoRepository.findById(id);
    if (transacao.isPresent()) {
      transacaoRepository.deleteById(id);
    } else {
      throw new RuntimeException("Transação não encontrada!");
    }
  }
}
