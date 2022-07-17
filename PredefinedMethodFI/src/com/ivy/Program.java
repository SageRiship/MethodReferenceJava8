package com.ivy;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lambda Expression
		//Demo d = ()->System.out.println("m1() method from Program");
		
		//Method reference for instance method
		//Demo d = new DemoImpl() :: m1;
		
		//method reference for static method
		//Demo d = DemoImpl :: m1;
		
		Demo d = DemoImpl:: add ;
		d.add(10,20);
		//d.m1();

	}

}
