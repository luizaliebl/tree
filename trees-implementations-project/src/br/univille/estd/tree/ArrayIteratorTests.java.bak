package br.univille.estd.tree;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;

import org.junit.Test;


public class ArrayIteratorTests {
	
	
	
	@Test
	public void iteradorVazio() {
		Integer a[] = {};
		Iterator<Integer> i = new ArrayIterator<Integer>(a); 
		assertEquals("Iterator vazio", false,i.hasNext());
	}
	
	@Test
	public void iteradorComElementos() {
		Integer a[] = {1,2,3};
		Iterator<Integer> i = new ArrayIterator<Integer>(a); 
		assertEquals("Iterator com elementos", true,i.hasNext());
	}
	
	@Test
	public void iteradorPegarPrimeiroElemento() {
		Integer a[] = {1,2,3};
		Iterator<Integer> i = new ArrayIterator<Integer>(a); 
		assertEquals("Pegar o primeiro elemento", (Integer)1,i.next());
	}
	
	@Test
	public void iteradorPegarSegundoElemento() {
		Integer a[] = {1,2,3};
		Iterator<Integer> i = new ArrayIterator<Integer>(a); 
		i.next();
		assertEquals("Pegar o primeiro elemento", (Integer)2,i.next());
	}
	
	@Test
	public void iterarAteOFinal() {
		Integer a[] = {1,2,3};
		Iterator<Integer> i = new ArrayIterator<Integer>(a); 
		Integer x = null;
		while(i.hasNext()) {
			x = i.next();
		}
		assertEquals("Iterar até o final", (Integer)3,x);
	}

}
