import java.util.Scanner;

public class Ex1091 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] a= new int[4];

        for(int i = 0; i<4; i++) {//배열로 시작값, 등차값, 갯수 입력받기
            a[i] = sc.nextInt();
        }
        long result = a[0];
        for(int i = 1; i<a[3]; i++) {
            result = result*a[1]+a[2];
        }
        System.out.println(result);


    }
}
