import java.util.Scanner;
class ch2_ps2
{
	public static void main(String[] args)
		{
			Scanner s = new Scanner(System.in);
			System.out.println("enter a charcter : ");
			char a = 'A';	
			a = (char)(a + 8);
			System.out.println(a);	

			//decrypting the grade
			a = (char)(a - 8);
			System.out.println(a);	

		}

}