package chap01.slp.expList;

import chap01.slp.exp.Exp;

public class PairExpList extends ExpList {
	Exp head;
	ExpList tail;

	public PairExpList(Exp h, ExpList t) {
		head = h;
		tail = t;
	}
}

