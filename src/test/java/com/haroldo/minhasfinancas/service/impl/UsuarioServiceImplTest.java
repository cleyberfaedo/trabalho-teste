package com.haroldo.minhasfinancas.service.impl;

import com.haroldo.minhasfinancas.model.entity.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioServiceImplTest {

    @Test
    @DisplayName("Salvar usuario")
    public void saveUser() throws Exception {
        Usuario usuario = new Usuario(1L,"cleyber", "cleyber@gmail.com","1234");
        UsuarioServiceImpl usuarioServiceImpl = null;
        assertNotNull(usuarioServiceImpl.salvarUsuario(usuario));
    }

    @Test
    @DisplayName("Nao salve se o email ja tiver cadastrado")
    public void testEmail(){
        Usuario usuario = new Usuario(1L,"cleyber", "cleyber@gmail.com","1234");
        Assertions.assertFalse(UsuarioServiceImpl.validarEmail(usuario.getEmail()));
    }
    

}