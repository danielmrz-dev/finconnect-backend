package br.com.fiap.finconnect.controller;

import br.com.fiap.finconnect.model.Usuario;
import br.com.fiap.finconnect.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

}
