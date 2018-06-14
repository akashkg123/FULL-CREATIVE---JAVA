package Trail;

class Xruns {
	{
		System.out.println("I am FIRST INSTANCE BLOCK!!");
	}

	Xruns() {
		System.out.println("I am FIRST CONSTRUCTOR!!");
	}

	static {
		System.out.println("I am FIRST STATIC BLOCK!!");
	}
	public void general() {
		System.out.println("I am normal method");
	}
}

class Test extends Xruns {
	Test() {
		//super();
		System.out.println("I am SECOND class Constructor");
	}

	{
		System.out.println("I am SECOND class INSTANCE BLOCK");
	}
	static {
		System.out.println("I am SECOND STATIC ");
		int a = 10;
		System.out.println(a+2);
		
	}
	public void general1() {
		System.out.println("I am normal method");
	}
}

public class WhatRuns {
	public static void main(String[] args) {
		Xruns ob = new Xruns();
		ob.general();
		System.out.println();
		Test ob1 = new Test();
		ob1.general1();
	}

}
