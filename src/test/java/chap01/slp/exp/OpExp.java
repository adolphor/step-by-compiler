package chap01.slp.exp;

public class OpExp extends Exp {
	Exp left, right;
	int oper;
	final static int Plus = 1, Minus = 2, Times = 3, Div = 4;

	public OpExp(Exp l, int o, Exp r) {
		left = l;
		oper = o;
		right = r;
	}
}
