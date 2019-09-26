package br.univille.estd.tree;

import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {
	
	private E[] array;
	private int cursorPosition;
	
	public ArrayIterator(E[] lista) {
		this.array = lista;
	}

	@Override
	public boolean hasNext() {
		
		if (cursorPosition < array.length) {
			return true;
		} else {
			cursorPosition = 0;
			return false;
		}
	}

	@Override
	public E next() {
		E elemento = array[cursorPosition];
		cursorPosition++;;		
		return elemento;
	}

}
