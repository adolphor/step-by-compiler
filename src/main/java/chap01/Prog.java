package chap01;

import chap01.slp.exp.EseqExp;
import chap01.slp.exp.IdExp;
import chap01.slp.exp.NumExp;
import chap01.slp.exp.OpExp;
import chap01.slp.expList.LastExpList;
import chap01.slp.expList.PairExpList;
import chap01.slp.stm.AssignStm;
import chap01.slp.stm.CompoundStm;
import chap01.slp.stm.PrintStm;
import chap01.slp.stm.Stm;

public class Prog {

	public static Stm prog = new CompoundStm(

		new AssignStm("a", new OpExp(new NumExp(5), OpExp.Plus, new NumExp(3))),

		new CompoundStm(
			new AssignStm(
				"b",
				new EseqExp(
					new PrintStm(
						new PairExpList(
							new IdExp("a"),
							new LastExpList(new OpExp(new IdExp("a"), OpExp.Minus, new NumExp(1)))
						)
					),
					new OpExp(new NumExp(10), OpExp.Times, new IdExp("a"))
				)
			),
			new PrintStm(new LastExpList(new IdExp("b")))
		)
	);
}
