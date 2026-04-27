package br.com.fiap.finconnect.repository;

import br.com.fiap.finconnect.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
  List<Transacao> findByUsuarioId(Long id);
}
