package br.com.fiap.finconnect.repository;

import br.com.fiap.finconnect.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

  Usuario getUsuarioById(Long id);
}
