package chap01;

import chap01.slp.stm.Stm;

public class Interp {

	public static void interp(Stm s) { /* you write this part */ }

	public static int maxargs(Stm s) { /* you write this part */
		return 0;
	}

	public static void main(String args[]) throws java.io.IOException {
		System.out.println(maxargs(Prog.prog));
		interp(Prog.prog);
	}

}
