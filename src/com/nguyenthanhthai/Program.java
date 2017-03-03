package com.nguyenthanhthai;

import com.nguyenthanhthai.utils.Expression;
import com.nguyenthanhthai.utils.ExpressionBuilder;

public class Program {


	
	public static void main(String[] args) {
		Expression ex=new ExpressionBuilder("9+1.2+3-(3+3)").build();
		double result=ex.evaluate();
		System.out.println(result);

	}

}
