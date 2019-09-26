package br.univille.estd.tree;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;

import org.junit.Test;

public class PositionTests {

	
	@Test
	public void quantidadeDeFilhos() {
		Position<Integer> p = new Position<>(1);
		p.addChild(2);
		assertEquals("Quantidade de filhos",
				1,
				p.size());
	}
	
	@Test
	public void removerFilho() {
		Position<Integer> parent = new Position<>(1);
		parent.addChild(2);
		parent.addChild(3);
		
		// pega o primeiro filho
		Position<Integer> firstChild = parent.getChildren().next();
		// remove
		parent.removeChildren(firstChild);
		
		assertEquals("Quantidade de filhos",
				1,
				parent.size());
		assertEquals("Primeiro filho",
				(Integer)2,
				firstChild.getElement());
	}
	
	@Test
	public void ultimoFilho() {
		Position<Integer> parent = new Position<>(1);
		parent.addChild(2);
		parent.addChild(3);
		parent.addChild(4);
		parent.addChild(5);
		
		// pega o primeiro filho
		Iterator<Position<Integer>> iterator = parent.getChildren();
		
		// busca ultimo filho
		Position<Integer> child = null; 
		while(iterator.hasNext()) {
			child = iterator.next();
		}
		
		assertEquals("Quantidade de filhos",
				4,
				parent.size());
		assertEquals("Ultimo filho",
				(Integer)5,
				child.getElement());
	}
	
}
