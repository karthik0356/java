import java.util.Scanner;

class marks {
    public static void main(String[] args)
	{
		int total_marks = 500;
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter english marks");
        	int a = sc.nextInt();
        
        	System.out.println("Enter maths marks");
        	int b = sc.nextInt();
        
        	System.out.println("Enter science marks");
        	int c = sc.nextInt();
        
        	System.out.println("Enter social marks");
        	int d = sc.nextInt();
        
        	System.out.println("Enter Kannada marks");
        	int e = sc.nextInt();

		float obtained_marks = a+b+c+d+e;

		float percent = (obtained_marks/total_marks)*100;

        	System.out.println("The percentage is : " + percent);

        	//System.out.println(a);
        	//System.out.println(b);
        	//System.out.println(c);
        	//System.out.println(d);
        	//System.out.println(e);
    }
}