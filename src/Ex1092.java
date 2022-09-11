import java.util.Scanner;

public class Ex1092 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        for(int i = 0; i<3; i++){
            arr[i] = sc.nextInt();
        }
        int i = 1;
        while(i % arr[0] != 0 || i % arr[1] != 0 || i % arr[2] != 0) {
            i++;
        }
        System.out.println(i);

    }
}
