import java.util.Scanner;

class ch4_prgm1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr three subjects marks");
		int sub1 = sc.nextInt();
		int sub2 = sc.nextInt();
		int sub3 = sc.nextInt();
		System.out.println("Subject 1 marks = "+sub1+"\nSubject 2 marks = "+sub2+"\nSubject 3 marks = "+sub3);
		double avg = (sub1 + sub2 + sub3)/3;
		System.out.println("yous overall percantage is : " +avg);
		if(avg >= 40 && sub1 >= 33 && sub2 >= 33 && sub3 >= 33){
			System.out.println("Pass");
		}
		else{
			System.out.println("fail");
		}
	}
}