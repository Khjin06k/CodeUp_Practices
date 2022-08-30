import java.util.Scanner;

public class EX1020 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        a = a.replaceAll("-", "");

        System.out.printf(a);
    }
}
