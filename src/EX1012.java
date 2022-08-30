import java.util.Scanner;

public class EX1012 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        float a = scanner.nextFloat();
        String str = String.format("%.6f", a);
        System.out.println(str);
    }
}
