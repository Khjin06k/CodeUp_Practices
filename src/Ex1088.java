import java.util.Scanner;

public class Ex1088 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int plus = 0;

        for(int i = 1; i<=a; i++){
           if(i%3!=0){
               System.out.print(i+" ");
           }
        }
    }
}
