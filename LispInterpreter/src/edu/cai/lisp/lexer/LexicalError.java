package edu.cai.lisp.lexer;

public class LexicalError extends Exception{

	private static final long serialVersionUID = 1L;

	/**
	 * @param message
	 * @param cause
	 */
	public LexicalError(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public LexicalError(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
