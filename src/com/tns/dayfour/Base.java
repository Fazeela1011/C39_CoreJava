package com.tns.dayfour;

public class Base {
	int varDefault = 10;
	public int varPublic = 20;
	protected int varProtected = 40;

	void methodDefault() {
		System.out.println("Default access Base class");
		System.out.println("Default Variable : " + varDefault);
	}

	public void methodPublic() {
		System.out.println("Public access Base class");
		System.out.println("Public Variable : " + varPublic);
	}

	protected void methodProtected() {
		System.out.println("Protected access Base class");
		System.out.println("Protected Variable : " + varProtected);
	}

}
