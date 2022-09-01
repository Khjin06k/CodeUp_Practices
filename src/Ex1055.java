import java.util.Scanner;

public class Ex1055 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(b == 1 || a==1){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
