package edu.java.lambda01;

import edu.java.lambda01.Calculator.Calculable;

public class CalcAdder implements Calculable{
	
	@Override
	public double calculate(double x, double y) {
		return x + y;
	}
}
