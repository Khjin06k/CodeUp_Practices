import java.util.Scanner;

public class Ex1095 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];

        for(int i=0; i<a; i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int j = 1; j<a; j++) {
            if(arr[j]<min){
                min = arr[j];
            }
        }
        System.out.println(min);
    }
}
