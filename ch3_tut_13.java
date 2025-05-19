import java.util.Scanner;
class ch3_tut_13{
	public static void main(String[] args){
		// String name = new String("karthik");
		String name = "KARTHIK";
		System.out.print("The name is : ");
		System.out.println(name);
		// int a = 3;
		// float b = 33.322f;
		// System.out.printf("the value of a is %d and the value of b is %f", a, b);
		// System.out.format("the value of a is %d and the value of b is %f", a, b);
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		System.out.println(st);
		String cs = sc.nextLine();
		System.out.println(cs);
	}
}