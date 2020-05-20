package br.mockito.dao;

import org.junit.Test;

import br.mockito.model.Usuario;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class UsuarioDaoTest {
	
	@Test
	public void salvaUsuarioNoBancoDeDados() {
		Usuario usuario = new Usuario();
		usuario.setNome("Adriano");
		usuario.setEmail("adriano@email.com");
		
		UsuarioDao dao = mock(UsuarioDao.class);
		Usuario userExpected = dao.save(usuario);
		when(dao.save(usuario)).thenReturn(new Usuario("Adriano", "adriano@email.com"));

		assertEquals(userExpected.getNome(), "Adriano");
	}

}
