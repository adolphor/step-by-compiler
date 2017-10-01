package chap04.Absyn;

import chap04.Symbol.Symbol;

public class CallExp extends Exp {
	public Symbol func;
	public ExpList args;

	public CallExp(int p, Symbol f, ExpList a) {
		pos = p;
		func = f;
		args = a;
	}
}
