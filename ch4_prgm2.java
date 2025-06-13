import java.util.Scanner;

class ch4_prgm2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double tax =  0;
		double income   = sc.nextDouble();
		if(income < 2.5){
			tax = tax + 0;
		}
		else if(income > 2.5 && income <= 5){
			tax = tax + 0.05 * (income - 2.5);
		}
		else if(income > 5 && income <= 10.0){
			tax = tax + 0.05 * (5.0f - 2.5);		}
		else if(income > 10.0){
			tax = tax + 0.05 * (5.0f - 2.5);
			tax = tax + 0.2  * (10.0f - 5);
			tax = tax + 0.3 * (income - 10.0);
		}
		System.out.println("the total tax paid by the employee is : " +tax);
	}
}