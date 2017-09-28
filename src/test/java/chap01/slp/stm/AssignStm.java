package chap01.slp.stm;

import chap01.slp.exp.Exp;

public class AssignStm extends Stm {
	String id;
	Exp exp;

	public	AssignStm(String i, Exp e) {
		this.id = i;
		this.exp = e;
	}
}

