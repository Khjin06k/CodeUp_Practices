import java.util.Scanner;

public class Ex1064 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = 0;
        min = (a>b)?b:a;
        min = (min>c)?c:min;

        System.out.println(min);
    }
}
