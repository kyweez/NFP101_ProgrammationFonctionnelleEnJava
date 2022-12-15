package edu.cai.lisp.lexer;

public class Lexeme {
	private String value;
	private LexicalUnit type;
	private Integer position;
	
	/**
	 * @param value
	 * @param type
	 * @param position
	 */
	public Lexeme(String value, LexicalUnit type, Integer position) {
		super();
		this.value = value;
		this.type = type;
		this.position = position;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the type
	 */
	public LexicalUnit getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(LexicalUnit type) {
		this.type = type;
	}

	/**
	 * @return the position
	 */
	public Integer getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(Integer position) {
		this.position = position;
	}
	
	
	
}
