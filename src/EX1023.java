import java.util.Scanner;

public class EX1023 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    String a = scanner.nextLine();
    String str[] = a.split("[.]");

    System.out.println(str[0]);
    System.out.println(str[1]);
    }
}
