package com.cda.zprog;

import com.cda.calc.ICalculateur;
import com.cda.calc.PierreCalculateur;

public class Program {
	public static void main(String[] args) {
		String vParam = "CDA-20285";
		ICalculateur.CALCULATEURS.add(new PierreCalculateur());
		for (ICalculateur vCalculateur : ICalculateur.CALCULATEURS) {

			System.out.println(vCalculateur.calc(vParam));
		}
	}
}
