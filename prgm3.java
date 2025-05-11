import java.util.Scanner;

public class prgm3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter subject 1 marks:");
        float a = s.nextInt();
        System.out.println("Enter subject 2 marks:");
        float b = s.nextInt();
        System.out.println("Enter subject 3 marks:");
        float c = s.nextInt();
        float cgpa = (a + b + c)/30;
        System.out.println(cgpa);
    }
}
