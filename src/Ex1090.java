import java.util.Scanner;

public class Ex1090 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] a= new int[3];

        for(int i = 0; i<3; i++) {//배열로 시작값, 등차값, 갯수 입력받기
            a[i] = sc.nextInt();
        }
        long result = a[0]*(long)Math.pow(a[1],a[2]-1); //Math.pow는 double 형이기 때문에 타입 변환 필요
        System.out.println(result);

    }
}
