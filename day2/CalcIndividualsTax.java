package week3.day2;

import week3.day1.Student;

public class CalcIndividualsTax  extends Student  implements   TaxCaliculation,IncomeCalculation{

	public double calcNetIncome(String name, double income1, double income2) {
		System.out.println("This is implemented method for inteface IncomeCalculation");
		System.out.println("This is calacNetIncome method");
		System.out.println("This method will give name ,income1 and income2");
		return 0;
	}

	public void calcDeductions(String name, double HRA, double LTA) {
		System.out.println("This is implemented method for inteface TaxCaliculation");
		System.out.println("This is calacDeductions method");
		System.out.println("This method will give name ,HRA and LTA");
		System.out.println(name);
		double income = HRA + LTA;
		System.out.println(income);
	
	}

	public void calcGrossIncome(String name, double netIncome, double deductions) {
		System.out.println("This is implemented method for inteface TaxCaliculation");
		System.out.println("This is calacGrossIncome method");
		System.out.println("This method will give name ,netIncome and deductions");
		
	}

	public int taxSlab() {
		System.out.println("This is implemented method for inteface TaxCaliculation");
		System.out.println("This is taxslab method");
		System.out.println("This method return int value");
		return 0;
	}

	public double CalcTaxandPublishValue() {
		System.out.println("This is implemented method for inteface TaxCaliculation");
		System.out.println("This is calcTaxandPublishvalue method");
		System.out.println("This method will also return int value");
		return 0;
	}

}
