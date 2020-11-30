package com.cda.zprog;

import com.cda.calc.ICalculateur;

public class Program {
	public static void main(String[] args) {
		String vParam = "CDA-20285";

		for (ICalculateur vCalculateur : ICalculateur.CALCULATEURS) {

			System.out.println(vCalculateur.calc(vParam));
		}
	}
}
