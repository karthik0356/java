import java.util.Scanner;

public class prgm4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter kilometer  ");
        float km = s.nextFloat();
        double miles = km * 0.6213712;
        System.out.println(miles);
    }
}
