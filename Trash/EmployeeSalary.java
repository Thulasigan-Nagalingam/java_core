class EmployeeSalary{
	public static void main(String args[]){
		
		int BasicSalary=12000;
		if(BasicSalary>=100000){
			int Tax=((BasicSalary*5)/100);
			System.out.println("Basic Salary: "+BasicSalary);
			System.out.println("Tax: "+Tax);
			System.out.println("Net Worth: "+(BasicSalary-Tax));
		}
		else{
			int Tax=((BasicSalary*1)/100);
			System.out.println("Basic Salary: "+BasicSalary);
			System.out.println("Tax: "+Tax);
			System.out.println("Net Worth: "+(BasicSalary-Tax));
		}
	}
}