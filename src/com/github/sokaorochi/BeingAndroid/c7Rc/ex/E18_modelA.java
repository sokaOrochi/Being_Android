package com.github.sokaorochi.BeingAndroid.c7Rc.ex;

import java.util.*;

class Test {
	Test() { System.out.println("Test()"); }
}

public class E18_modelA {
	private String name;
	public E18_modelA(String s) { name = s;  } 
	static final Test sft = new Test(); // constant reference address
	private final Test ft = new Test();
	static final String SFS = "static final"; // class constant
	private final String fs = "final";
	private static Random rand = new Random();
	static final int SFI = rand.nextInt(); // class constant 
	private final int fi = rand.nextInt();
	public String toString() {
		return (name + ": " + sft + ", " + ft + ", " + SFS + ", " + fs + ", " + SFI + ", " + fi);   
	} 		
	public static void main(String[] args) {
		E18_modelA d1 = new E18_modelA("d1");
		E18_modelA d2 = new E18_modelA("d2");
		E18_modelA d3 = new E18_modelA("d3");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}
}