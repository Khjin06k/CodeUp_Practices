import java.util.Scanner;

public class Ex1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double h = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double s = sc.nextDouble();

        System.out.println(String.format("%.1f MB", (h*b*c*s)/8388608));
    }
}