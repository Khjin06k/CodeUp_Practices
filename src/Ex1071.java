import java.util.Scanner;

public class Ex1071 {
    public static void main(String[] args){
        Function();
    }

    public static void Function(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch (a) {
            case 0:
                break;
            default:
                System.out.println(a);
                Function();
        }
    }
}