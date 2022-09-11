import java.util.Scanner;

public class Ex1093 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[23];

        for(int i=0; i<a; i++){
            int b = sc.nextInt();
            arr[b-1] +=1;
        }

        for(int j = 0; j<23; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
