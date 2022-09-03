import java.util.Scanner;

public class Ex1080 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int plus = 0;
        for(int i=0; i<=a; i++){
            plus +=i;
            if(a<=plus){
                System.out.println(i);
                break;
            }
        }
    }
}
