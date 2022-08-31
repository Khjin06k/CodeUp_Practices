import java.util.Scanner;

public class Ex1050 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();

        if(a == b){
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}