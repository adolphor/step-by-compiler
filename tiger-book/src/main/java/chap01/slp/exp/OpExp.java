package chap01.slp.exp;

public class OpExp extends Exp {

	public Exp left, right;
	public int oper;

	public final static int Plus = 1, Minus = 2, Times = 3, Div = 4;

	public OpExp(Exp l, int o, Exp r) {
		left = l;
		oper = o;
		right = r;
	}

}
