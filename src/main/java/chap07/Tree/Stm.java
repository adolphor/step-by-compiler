package chap07.Tree;

abstract public class Stm {
	abstract public ExpList kids();

	abstract public Stm build(ExpList kids);
}

