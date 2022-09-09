import java.util.Scanner;

public class Ex1089 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] a= new int[3];

        for(int i = 0; i<3; i++){//배열로 시작값, 등차값, 갯수 입력받기
            a[i] = sc.nextInt();
        }
        int result = 0;
        result = a[0]+a[1]*(a[2]-1);
        System.out.println(result);

    }
}
