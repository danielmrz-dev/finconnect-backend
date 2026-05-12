package br.com.fiap.finconnect.repository;

import br.com.fiap.finconnect.model.AreaAtuacao;
import br.com.fiap.finconnect.model.AreaAtuacaoNome;
import br.com.fiap.finconnect.model.Especialista;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EspecialistaRepository extends JpaRepository<Especialista, Long> {
  List<Especialista> findEspecialistasByAreaAtuacaoId(Long id);
}
