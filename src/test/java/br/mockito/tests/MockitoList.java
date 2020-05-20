package br.mockito.tests;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.LinkedList;
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
	
	@Test
	public void adicionaItemUsandoVerify() {
		List<String> mockedList = mock(List.class);

		mockedList.add("one");
		verify(mockedList).add("one");
	}
	
	@Test(expected = RuntimeException.class)
	public void usando() {
		LinkedList mockedList = mock(LinkedList.class);

		when(mockedList.get(0)).thenReturn("first");
		when(mockedList.get(1)).thenThrow(new RuntimeException());

		System.out.println(mockedList.get(0));
		System.out.println(mockedList.get(1));
		System.out.println(mockedList.get(2));
		verify(mockedList).get(0);
		verify(mockedList).get(1);
	}
}
