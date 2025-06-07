import java.util.Scanner;

class ch4_switch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age:");
		int age = sc.nextInt();
		// we can use char,string,int as condition
	
		switch(age){
			case 18:
				System.out.println("uh r going to engineering");
				break;
			case 25:
				System.out.println("uh r going to get a job");
				break;
			case 30:
				System.out.println("uh r going to become a Billionair");
				break;
			default:
				System.out.println("enjoy the pase of life");
		
		}		
	}
}