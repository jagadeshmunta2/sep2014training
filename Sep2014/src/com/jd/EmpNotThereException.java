package com.jd;

public class EmpNotThereException extends Exception{

	public EmpNotThereException() {
		super("No default employee");
	}
	
	public EmpNotThereException(String mesg) {
		super(mesg);
	}
}
