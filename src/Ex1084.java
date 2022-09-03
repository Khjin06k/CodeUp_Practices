import java.util.Scanner;

public class Ex1084 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = 0;
        for(int i = 0; i<a; i++){
            for(int j =0; j<b; j++) {
                for (int k = 0; k < c; k++) {
                    System.out.println(String.format("%d %d %d", i, j, k));
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
