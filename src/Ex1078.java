import java.util.Scanner;

public class Ex1078 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int plus = 0;
        for(int i = 0; i<=a; i++){
            if(i%2==0){
                plus +=i;
            }
        }
        System.out.println(plus);
    }
}
