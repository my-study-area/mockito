package br.mockito.tests;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;

public class MockitoList {

	@Test
	public void EhUmaLista() {
		List<String> list = mock(List.class);
		assertThat(list, instanceOf(List.class));
	}

	@Test
	public void adicionaUmaItem() {
		List<String> list = mock(List.class);
	    when(list.size()).thenReturn(1);
	    assertEquals(1, list.size());
	}
}
