package llPositionalList;

import java.util.Iterator;

import interfaces.Position;
import interfaces.PositionalList;

public class F2LIteratorMaker<E> {
	public Iterator<Position<E>> makeIterator(PositionalList<E> pl) {
		return new PLIteratorF2L(pl);
	}
}
