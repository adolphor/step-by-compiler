package chap02.Parse;

interface Lexer {
	public java_cup.runtime.Symbol nextToken() throws java.io.IOException;
}
