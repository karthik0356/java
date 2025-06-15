import java.util.Scanner;

class ch4_prgm5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ur website name with extension aslo : ");
		String web = sc.next();
		if(web.endsWith(".org")){
			System.out.println("this is an organizational website");
		}
		else if(web.endsWith(".com")){
			System.out.println("this is an commercial website");
		}
		else if(web.endsWith(".in")){
			System.out.println("this is an Indian website");
		}
	}
}