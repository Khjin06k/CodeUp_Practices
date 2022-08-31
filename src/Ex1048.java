import java.util.Scanner;

public class Ex1048 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long result = 1;
        for(int i=1; i<=b; i++){
            result = result*2;
        }
        result = result*a;

        System.out.println(result);

    }
}