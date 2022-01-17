package com.nic.san;

public class Test {
	private int a=10;
	private String name="Ajay";
	
	
	public Test() {
		System.out.println("Test.Test()::Zero Param construtor");
	}


	@Override
	public String toString() {
		return "Test [a=" + a + ", name=" + name + "]";
	}
	

}
