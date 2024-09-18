package org.demo.com;

public class main {
	public static void main(String[] args) {
		LoanAmortizationCalc calc = LoanAmortizationCalcUtil.acceptRecord();
		LoanAmortizationCalcUtil.menuList(calc);
	}
}
