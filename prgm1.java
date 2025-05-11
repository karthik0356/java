import java.util.Scanner;

public class prgm1 {
    public static void main(String[] args) {
        System.out.println("Enter three values");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt() ; 
        int b = s.nextInt() ;
        int c = s.nextInt() ;
        int sum = a + b + c ;
        System.out.println(sum);
    }
}