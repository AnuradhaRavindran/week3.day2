package week3.day2;

public class CalcBusinesstax implements TaxCaliculation,IncomeCalculation{

	public double calcNetIncome(String name, double income1, double income2) {
		System.out.println("This is calcNetIncome method");
		System.out.println("This method will give name ,income1 and income2");
		return 0;
	}

	public void calcDeductions(String name, double HRA, double LTA) {
		System.out.println("This is calcDeductions method");
		System.out.println("This method will give name ,HRA and LTA");
		System.out.println(name);
		double income = HRA+LTA;
		System.out.println(+income);
		
	}

	public void calcGrossIncome(String name, double netIncome, double deductions) {
		System.out.println("This is calacGrossIncome method");
		System.out.println("This method will give name ,netIncome and deductions");
		
	}

	public int taxSlab() {
		System.out.println("This istaxslab method");
		System.out.println("This method will return int value");
		return 0;
	}

	public double CalcTaxandPublishValue() {
		System.out.println("This is CalcTaxandPublishValue");
		System.out.println("This method will return int value");
		return 0;
	}

}
