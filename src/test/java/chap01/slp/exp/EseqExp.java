package chap01.slp.exp;

import chap01.slp.stm.Stm;

public class EseqExp extends Exp {
	Stm stm;
	Exp exp;

	public	EseqExp(Stm s, Exp e) {
		stm = s;
		exp = e;
	}
}