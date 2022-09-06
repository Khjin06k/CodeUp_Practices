import java.util.Scanner;
//반복문 없이 입력 및 출격하는 방법 생각 필요
public class Ex1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int[] arr = new int[a];

        for(int i = 0; i<a; i++){
            arr[i] = sc.nextInt();
        }
        for(int j = 0; j<a; j++) {
            System.out.println(arr[j]);
        }

    }
}