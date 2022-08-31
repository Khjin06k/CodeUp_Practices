import java.util.Scanner;

public class Ex1046 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();

        System.out.println(a+b+c);
        System.out.printf("%.1f",(float)(a+b+c)/3);
    }
}