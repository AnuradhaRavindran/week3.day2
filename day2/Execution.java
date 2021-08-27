package week3.day2;

public class Execution {

	public static void main(String[] args) {
		CalcIndividualsTax obj = new CalcIndividualsTax();
		obj.calcDeductions("Tom",120000.78, 34667.90);
		obj.calcGrossIncome(null, 0, 0);
		obj.calcNetIncome(null, 0, 0);
		obj.CalcTaxandPublishValue();
		obj.taxSlab();
		obj.studentDept();
		
		
		
		
	}

}
