package chap04.Absyn;

import chap04.Symbol.Symbol;

public class ArrayTy extends Ty {
	public Symbol typ;

	public ArrayTy(int p, Symbol t) {
		pos = p;
		typ = t;
	}
}
