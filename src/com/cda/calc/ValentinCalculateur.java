package com.cda.calc;

public class ValentinCalculateur implements ICalculateur {

	@Override
	public String calc(String param) {
		return param.concat(" : Valentin");
	}

}
