package br.com.fiap.finconnect.controller;

import br.com.fiap.finconnect.model.Usuario;
import br.com.fiap.finconnect.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

  @Autowired
  UsuarioService usuarioService;

  @GetMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public Usuario buscarUsuario(@PathVariable Long id) {
    return usuarioService.buscarUsuarioPorId(id);
  }

  @GetMapping()
  @ResponseStatus(HttpStatus.OK)
  public List<Usuario> buscarUsuario() {
    return usuarioService.listarTodosUsuarios();
  }

  @PutMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public Usuario atualizaUsuario(@PathVariable Long id, @RequestBody Usuario usuarioAtualizado) {
    return usuarioService.atualizarUsuario(id, usuarioAtualizado);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void excluiUsuario(@PathVariable Long id) {
    usuarioService.excluirUsuario(id);
  }

}
