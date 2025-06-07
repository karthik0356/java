import java.util.Scanner;

class ch4_enhancedSwitch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age:");
		int age = sc.nextInt();
	
		switch(age){
			case 18->System.out.println("uh r going to engineering");
			case 25->System.out.println("uh r going to get a job");
			case 30->System.out.println("uh r going to become a Billionair");
			default->System.out.println("enjoy the pase of life!!!");
		}		
	}
}