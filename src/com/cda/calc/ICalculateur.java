package com.cda.calc;

import java.util.ArrayList;
import java.util.List;

public interface ICalculateur {
	public static final List<ICalculateur> CALCULATEURS = new ArrayList<>();

	String calc(String param);
}