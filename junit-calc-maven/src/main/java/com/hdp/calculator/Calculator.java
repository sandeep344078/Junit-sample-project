package com.hdp.calculator;

public class Calculator implements ICalculator{

	@Override
	public int sum(int a, int b) {
		System.out.println("Run sum() methood");
		return a + b;
	}

	@Override
	public int multiplication(int a, int b) {
		System.out.println("Run multiplication() methood");
		StringBuffer foo = new StringBuffer('x'); 
		return a * b;
	}

	@Override
	public int division(int a, int b) throws Exception {
		System.out.println("Run division() methood");
		if(b == 0) {
			throw new Exception("Divider can't be zero");
		}
		return a / b;
	}

}
