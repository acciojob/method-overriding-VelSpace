package com.driver;

public class Main {
  
	public static class A{
		
		public static String meth() {
			return "Invoking method from class A";
		}
	}
	
	public static class B extends A{
		
		public static String meth() {
			return "Method is overridden in Extendend class B";
		}
		
	}
	public static void main(String[] args) {
		A p = new B();
		B p1 = new B();
		System.out.println(p.meth());
		System.out.println(p1.meth());
	}
}