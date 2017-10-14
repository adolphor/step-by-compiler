package chap01.slp.stm;

public class CompoundStm extends Stm {

	public Stm stm1;
	public Stm stm2;

	public CompoundStm(Stm s1, Stm s2) {
		this.stm1 = s1;
		this.stm2 = s2;
	}

}
