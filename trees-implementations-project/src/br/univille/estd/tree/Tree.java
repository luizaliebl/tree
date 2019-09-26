package br.univille.estd.tree;

import java.util.Iterator;

/*
 *  aÌ�rvore onde os nodos podem ter uma quantidade arbitraÌ�ria de filhos.
 * */
public class Tree<E> {
	
	private int size;
	private Position<E> root;
	
	
	public Position<E> root() throws EmptyTreeException{
		if (root == null) {
			throw new EmptyTreeException("Árvore vazia.");
		}
		
		return root;
	}
	
	
	public Position<E> parent(Position<E> position) throws BoundaryViolationException{
		if (position.getParent() == null) {
			throw new BoundaryViolationException("Esse nó não tem pai");
		}

		return position.getParent();
	}
	
	
	public Iterator<Position<E>> children(Position<E> position)  throws InvalidPositionException {
		if (position == null) {
			throw new InvalidPositionException("Posição inválida");
		}

		return position.getChildren();
	}
	
	
	public boolean isInternal(Position<E> position) throws InvalidPositionException  {
		if (position == null) {
			throw new InvalidPositionException("Posição inválida");
		}

		return position.size() > 0;
	}

	
	public boolean isExternal(Position<E> position)  throws InvalidPositionException {
		return !isInternal(position);
	}
	

	public boolean isRoot(Position<E> position) throws InvalidPositionException {
		if (position == null) {
			throw new InvalidPositionException("Posição inválida");
		}

		return root.equals(position);
	}


	public int size() {
		return size;
	}
	

	public boolean isEmpty() {
		return size == 0;
	}


	public Iterator<Position<E>> positions(){
		return root.getChildren();
	}
	

	public E replace(Position<E> position, E element) throws InvalidPositionException {
		if (position == null) {
			throw new InvalidPositionException("Posição inválida");
		}
		
		position.setElement(element);

		return element;
	}
	

	public Position<E> addRoot(E element) throws NonEmptyTreeException {
		if (root != null) {
			throw new NonEmptyTreeException("Já existe uma raiz");
		}
		size++;
		
		root = new Position<E>(element);

		return root;
	}
	

	public Position<E> addChild(Position<E> parent, E element) throws InvalidPositionException{
		if (parent == null) {
			throw new InvalidPositionException("Posição inválida");
		}
		size++;

		return parent.addChild(element);
	}
	
}
