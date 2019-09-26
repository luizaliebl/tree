package br.univille.estd.tree;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TreeUtilsTests {
	
	
	/**
	 * Calcula a profundidade da árvore
	 */
	@Test
	public void profundidadeDaArvore() {
		Tree<Integer> tree = new Tree<>();
		
		Position<Integer> root = tree.addRoot(0);

		Position<Integer> child1 = tree.addChild(root, -1);
		tree.addChild(child1,-2);
		tree.addChild(child1, -3);
		
		Position<Integer> child2 = tree.addChild(root,  1);
		tree.addChild(child2, 2);
		
		Position<Integer> child3 = tree.addChild(child2, 3);
		
		Position<Integer> child4 = tree.addChild(child3, 4);

		assertEquals("Profundidade da raiz", 0, TreeUtils.depth(tree, root));
		assertEquals("Profundidade do filho", 1, TreeUtils.depth(tree, child1));
		assertEquals("Profundidade do neto", 2, TreeUtils.depth(tree, child3));
		assertEquals("Profundidade do bisneto", 3, TreeUtils.depth(tree, child4));
	}

	/**
	 * Calcula a altura da árvore
	 */
	@Test
	public void alturaDaArvore() {
		Tree<Integer> tree = new Tree<>();
		
		Position<Integer> root = tree.addRoot(0);

		Position<Integer> child1 = tree.addChild(root, -1);
		tree.addChild(child1,-2);
		tree.addChild(child1, -3);
		
		Position<Integer> child2 = tree.addChild(root,  1);
		tree.addChild(child2, 2);
		
		Position<Integer> child3 = tree.addChild(child2, 3);
		
		Position<Integer> child4 = tree.addChild(child3, 4);
		
		assertEquals("Altura da árvore partindo da raiz", 3, TreeUtils.height(tree, root));
		assertEquals("Altura da árvore partindo do filho 1", 1, TreeUtils.height(tree, child1));
		assertEquals("Altura da árvore partindo do filho 2", 2, TreeUtils.height(tree, child2));
		assertEquals("Altura da árvore partindo do neto", 1, TreeUtils.height(tree, child3));
		assertEquals("Altura da árvore partindo do bisneto", 0, TreeUtils.height(tree, child4));
	}
	
	/**
	 * Convertendo a árvore para String utilizando preorder
	 */
	@Test
	public void arvoreParaStringPreOrder() {
		Tree<Integer> tree = new Tree<>();
		
		Position<Integer> root = tree.addRoot(0);

		Position<Integer> child1 = tree.addChild(root, -1);
		tree.addChild(child1,-2);
		tree.addChild(child1, -3);
		
		Position<Integer> child2 = tree.addChild(root,  1);
		tree.addChild(child2, 2);
		
		Position<Integer> child3 = tree.addChild(child2, 3);
		
		Position<Integer> child4 = tree.addChild(child3, 4);
		
		assertEquals("String da árvore partindo da raiz",    "0, -1, -2, -3, 1, 2, 3, 4", TreeUtils.toStringPreOrder(tree, root));
		assertEquals("String da árvore partindo do filho 1", "-1, -2, -3", TreeUtils.toStringPreOrder(tree, child1));
		assertEquals("String da árvore partindo do filho 2", "1, 2, 3, 4", TreeUtils.toStringPreOrder(tree, child2));
		assertEquals("String da árvore partindo do neto",    "3, 4", TreeUtils.toStringPreOrder(tree, child3));
		assertEquals("String da árvore partindo do bisneto", "4", TreeUtils.toStringPreOrder(tree, child4));
	}
	
	/**
	 * Convertendo a árvore para String utilizando postorder
	 */
	@Test
	public void arvoreParaStringPostOrder() {
		Tree<Integer> tree = new Tree<>();
		
		Position<Integer> root = tree.addRoot(0);

		Position<Integer> child1 = tree.addChild(root, -1);
		tree.addChild(child1,-2);
		tree.addChild(child1, -3);
		
		Position<Integer> child2 = tree.addChild(root,  1);
		tree.addChild(child2, 2);
		
		Position<Integer> child3 = tree.addChild(child2, 3);
		
		Position<Integer> child4 = tree.addChild(child3, 4);
		
		assertEquals("String da árvore partindo da raiz",    "-2, -3, -1, 2, 4, 3, 1, 0", TreeUtils.toStringPostOrder(tree, root));
		assertEquals("String da árvore partindo do filho 1", "-2, -3, -1", TreeUtils.toStringPostOrder(tree, child1));
		assertEquals("String da árvore partindo do filho 2", "2, 4, 3, 1", TreeUtils.toStringPostOrder(tree, child2));
		assertEquals("String da árvore partindo do neto",    "4, 3", TreeUtils.toStringPostOrder(tree, child3));
		assertEquals("String da árvore partindo do bisneto", "4", TreeUtils.toStringPostOrder(tree, child4));
	}
}
