class ConditionalStatement1{
	public static void main(String args[]){
		int x=20;
		if(true){
			System.out.println("It is true"); 
		}
		
		if(false){
			System.out.println("It is false");
		} 
		
		if(x>10){
			System.out.println("x>10");
		}
		else{
			System.out.println("x<=10");
		}
		
		//pass or fail
		int marks=64;
		if(marks>=75){
			System.out.println("pass");
		}
		else{
			System.out.println("fail");
		}
		
		
		// grading
		if(marks>=75){
			System.out.println('A');
		}
		else if(marks>=65){
			System.out.println('B');
		}
		else if(marks>=50){
			System.out.println('C');
		}
		else if(marks>=35){
			System.out.println('S');
		}
		else {
			System.out.println('W');
		}
		
		
	}
}