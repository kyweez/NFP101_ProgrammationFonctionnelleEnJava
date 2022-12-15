package edu.cai.lisp.lexer;

import java.util.StringTokenizer;

public class LexicalAnalyser {
	
	private String source;
	private StringTokenizer tokenizer;
	
	/**
	 * @param source
	 */
	public LexicalAnalyser(String source) {
		super();
		this.source = source;
		this.tokenizer = new StringTokenizer(source.trim(), "( )", false);
	}


	public Boolean hasNextLexeme() {
		return this.tokenizer.hasMoreTokens();
	}
	
	public Lexeme getNextLexeme() throws LexicalError {
		String token;
		do {
			token = this.tokenizer.nextToken().trim();
		} while(token.isEmpty());
		if(!this.tokenizer.hasMoreTokens()) {
			throw new LexicalError("");
		}
		return new Lexeme(source, LexicalAnalyser.getLexicalUnit(token), 0);
	}
	
	private static LexicalUnit getLexicalUnit(String token) {
		switch (token) {
		case "(":
			return LexicalUnit.START_LIST;
		case ")":
			return LexicalUnit.END_LIST;
		default:
			try {
				Integer.parseInt(token);
				return LexicalUnit.ATOM_NUMBER;
			} catch (NumberFormatException e) {
				return LexicalUnit.ATOM_NAME;
			}
		}
	}
}
