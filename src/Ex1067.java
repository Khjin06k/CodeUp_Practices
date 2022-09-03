import java.util.Scanner;

public class Ex1067 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println(a<0?"minus":"plus");
        System.out.println(a%2==0?"even":"odd");

    }
}
