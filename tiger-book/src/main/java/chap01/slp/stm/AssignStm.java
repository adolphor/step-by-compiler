package chap01.slp.stm;

import chap01.slp.exp.Exp;

public class AssignStm extends Stm {

	public String id;
	public Exp exp;

	public AssignStm(String i, Exp e) {
		this.id = i;
		this.exp = e;
	}

}

