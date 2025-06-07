import java.util.Scanner;

class ch4_elseif{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		if (age > 30){
			System.out.println("you are in adult phase");
		}
		else if(age > 18 ){
			System.out.println("you are in youth phase");
		}	
		else if(age > 4){
			System.out.println("you aren in childhood pase");
		}
		else{
			System.out.println("you are a baby");
		}
	}
}