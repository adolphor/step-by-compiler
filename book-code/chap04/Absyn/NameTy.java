package chap04.Absyn;

import chap04.Symbol.Symbol;

public class NameTy extends Ty {
	public Symbol name;

	public NameTy(int p, Symbol n) {
		pos = p;
		name = n;
	}
}
