package br.com.fiap.finconnect.service;

import br.com.fiap.finconnect.model.Usuario;
import br.com.fiap.finconnect.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

  @Autowired
  private UsuarioRepository usuarioRepository;

  public Usuario buscarUsuarioPorId(Long id) {
    Optional<Usuario> usuario = usuarioRepository.findById(id);
    if (usuario.isPresent()) {
      return usuario.get();
    } else {
      throw new RuntimeException("Usuário não encontrado!.");
    }
  };

  public List<Usuario> listarTodosUsuarios() {
    return usuarioRepository.findAll();
  }

  public void excluirUsuario(Long id) {
    Optional<Usuario> usuario = usuarioRepository.findById(id);
    if (usuario.isPresent()) {
      usuarioRepository.deleteById(id);
    } else {
      throw new RuntimeException("Usuário não encontrado!.");
    }
  }

  public Usuario atualizarUsuario(Long id, Usuario usuarioAtualizado) {
    Usuario usuarioAtual = usuarioRepository.findById(id)
      .orElseThrow(() -> new RuntimeException("Usuário não encontrado!"));
    usuarioAtual.setNome(usuarioAtualizado.getNome());
    usuarioAtual.setEmail(usuarioAtualizado.getEmail());
    usuarioAtual.setSenha(usuarioAtualizado.getSenha());
    usuarioAtual.setCpf(usuarioAtualizado.getCpf());
    usuarioAtual.setTelefone(usuarioAtualizado.getTelefone());
    usuarioAtual.setDataNascimento(usuarioAtualizado.getDataNascimento());
    usuarioAtual.setRenda(usuarioAtualizado.getRenda());
    usuarioAtual.setObjetivos(usuarioAtualizado.getObjetivos());
    return usuarioRepository.save(usuarioAtual);
  }

}
