import java.util.Scanner;

public class Ex1087 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int plus = 0;
        for(int i = 1; i<=a; i++){
            plus += i;
            if(plus>=a){
                System.out.println(plus);
                break;
            }
        }
    }
}
