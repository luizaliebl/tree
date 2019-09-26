package br.univille.estd.tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Iterator;

import org.junit.Test;

public class TreeTests {

	/**
	 * Verifica se a arvore esta vazia
	 */
	@Test
	public void arvoreVazia() {
		Tree<Integer> tree = new Tree<>();

		assertEquals("Árvore vazia", true, tree.isEmpty());
		assertEquals("Árvore vazia nao tem root", null, tree.root());
		assertEquals("Árvore vazia com tamanho 0", true, tree.size());
	}
	

	/**
	 * Adiciona o root e 
	 * Verifica se a arvore esta vazia
	 */
	@Test
	public void arvoreComRoot() {
		Tree<Integer> tree = new Tree<>();
		Position<Integer> root = tree.addRoot(1);
		
		assertEquals("Árvore com root", false, tree.isEmpty());
		assertEquals("Árvore com tamanho 1",1,tree.size());
		assertEquals("Root com o elemento 1",new Integer(1),root.getElement());
		assertEquals("Root com o elemento 1",new Integer(1),tree.root().getElement());
	}
	
	/**
	 * Tenta adicionar duas vezes o root
	 */
	@Test
	public void arvoreComRootNaoPodeSerAdicionadoNovoRoot() {
		Tree<Integer> tree = new Tree<>();
		Position<Integer> root = tree.addRoot(1);
		
		
		try {
			tree.addRoot(2);
			fail("Nao pode ser adicionado novo root.");
		}catch(NonEmptyTreeException e) {
			
		}
	}
	
	/**
	 * Verifica se o nó/posiçao é o root
	 */
	@Test
	public void noERoot() {
		Tree<Integer> tree = new Tree<>();
		Position<Integer> root = tree.addRoot(1);
		
		assertEquals("O no e root", true, tree.isRoot(root));
	}
	
	/**
	 * Adiciona filhos no root
	 */
	@Test
	public void rootComFilhos() {
		Tree<Integer> tree = new Tree<>();
		Position<Integer> root = tree.addRoot(1);
		
		Position<Integer>  child = tree.addChild(root, 2);
		
		try {
			tree.addChild(null,null);
			fail("Posicao inválida.");
		}catch(InvalidPositionException e) {
			
		}
		
		assertEquals("Árvore com tamanho 2",2,tree.size());
		assertEquals("Filho com o elemento 2",new Integer(2),child.getElement());
		
		assertEquals("Root com filho e elemento 2",new Integer(2),tree.root().getChildren().next().getElement());
	}
	
	/**
	 * Verifica se um nó é externo
	 */
	@Test
	public void noExterno() {
		Tree<Integer> tree = new Tree<>();
		Position<Integer> root = tree.addRoot(1);
		
		Position<Integer>  child = tree.addChild(root, 2);

		try {
			tree.isExternal(null);
			fail("Posicao inválida.");
		}catch(InvalidPositionException e) {
			
		}
		
		assertEquals("Nó deve ser externo",true,tree.isExternal(child));
		assertEquals("Root nao deve ser externo",false,tree.isExternal(root));
	
	}
	
	/**
	 * Verifica se um nó é interno
	 */
	@Test
	public void noInterno() {
		Tree<Integer> tree = new Tree<>();
		Position<Integer> root = tree.addRoot(1);
		
		Position<Integer>  child = tree.addChild(root, 2);

		try {
			tree.isInternal(null);
			fail("Posicao inválida.");
		}catch(InvalidPositionException e) {
			
		}
		
		assertEquals("Nó nao deve ser interno",false,tree.isInternal(child));
		assertEquals("Root deve ser interno",true,tree.isInternal(root));
	
	}
	
	
	/**
	 * Substitui o elemento de uma posicao
	 */
	@Test
	public void replace() {
		Tree<Integer> tree = new Tree<>();
		Position<Integer> root = tree.addRoot(1);
		
		Position<Integer>  child = tree.addChild(root, 2);
		
		tree.replace(child, 3);
		
		assertEquals("Árvore com tamanho 2",2,tree.size());
		assertEquals("Filho com o elemento 3",new Integer(3),child.getElement());
		
		assertEquals("Root com filho e elemento 3",new Integer(3),tree.root().getChildren().next().getElement());
	}
	
	/**
	 * Recupera o pai de uma posiçao
	 */
	@Test
	public void parent() {
		Tree<Integer> tree = new Tree<>();
		Position<Integer> root = tree.addRoot(1);
		
		Position<Integer>  child = tree.addChild(root, 2);
		
		Position<Integer> parent = tree.parent(child);
		
		try {
			tree.parent(root);
			fail("Root nao tem pai.");
		}catch(BoundaryViolationException e) {
			
		}
		
		assertEquals("Árvore com tamanho 2",2,tree.size());
		assertEquals("Parent é o root",new Integer(2),tree.isRoot(parent));
		
		assertEquals("Parent do filho com elemento 1",new Integer(1),parent.getElement());
	}
	
	/**
	 * Recupera os filhos de uma posicao
	 */
	@Test
	public void children() {
		Tree<Integer> tree = new Tree<>();
		Position<Integer> root = tree.addRoot(1);
		tree.addChild(root, 2);
		tree.addChild(root, 3);
		
		try {
			tree.children(null);
			fail("Posicao inválida.");
		}catch(InvalidPositionException e) {
			
		}
		Iterator<Position<Integer>> iterator = tree.children(root);
		
		assertEquals("Filho com elemento 2",new Integer(2),iterator.next().getElement());
		assertEquals("Filho com elemento 3",new Integer(3),iterator.next().getElement());
	}
	
	
		
	
}
