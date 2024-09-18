package org.demo.com;

public class LoanAmortizationCalc {
	private double principal;
	private double annualRate; 
	private int loanTerm; 

	public LoanAmortizationCalc(double principal, double annualRate, int loanTerm) {
		this.principal = principal;
		this.annualRate = annualRate;
		this.loanTerm = loanTerm;
	}

	// Getter and Setter methods
	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getAnnualRate() {
		return annualRate;
	}

	public void setAnnualRate(double annualRate) {
		this.annualRate = annualRate;
	}

	public int getLoanTerm() {
		return loanTerm;
	}

	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}

	
	public double calculateMonthlyPayment() {
		double monthlyRate = annualRate / 12 / 100;
		int months = loanTerm * 12;
		return principal * (monthlyRate * Math.pow(1 + monthlyRate, months)) / (Math.pow(1 + monthlyRate, months) - 1);
	}

	
	public double calculateTotalPayment() {
		return calculateMonthlyPayment() * loanTerm * 12;
	}

	
	@Override
	public String toString() {
		return "Monthly Payment: " + calculateMonthlyPayment() +
			   "\nTotal Payment: " + calculateTotalPayment();
	}
}
