package chap04.Absyn;

import chap04.Symbol.Symbol;

public class SimpleVar extends Var {
	public Symbol name;

	public SimpleVar(int p, Symbol n) {
		pos = p;
		name = n;
	}
}
