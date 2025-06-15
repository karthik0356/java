import java.util.Scanner;

class ch4_prgm3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the day number :");
		int day = sc.nextInt();
		switch(day) {
			case 1 -> System.out.println("Monday");
			case 2 -> System.out.println("Tuesday");
			case 3 -> System.out.println("Wednesday");
			case 4 -> System.out.println("Thrusday");
			case 5 -> System.out.println("friday");
			case 6 -> System.out.println("Saturday");
			case 7,0 -> System.out.println("sunday");
		}
	}
}