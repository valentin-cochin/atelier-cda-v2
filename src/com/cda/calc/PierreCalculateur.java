package com.cda.calc;

public class PierreCalculateur implements ICalculateur{

	@Override
	public String calc(String param) {
		return param+" = "+param;
	}
	
	
}
