package chap04.Parse;

interface Lexer {
	public Token nextToken() throws java.io.IOException;
}
