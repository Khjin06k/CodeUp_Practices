import java.util.Scanner;

public class Ex1071 {
    public static void main(String[] args){
        Function();
    }
    //반복문 없이 반복을 위해 재귀함수 이용 (함수 내 자기 자신을 계속 호출
    //메서드 이용!
    public static void Function(){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[];
        a = sc.nextInt();

        int i = 0;
        switch (a[i]) {
            case 0:
                break;
            default:
                System.out.println(a[i]);
                i++;
                Function();
        }
    }
}
