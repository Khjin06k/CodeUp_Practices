import java.util.Scanner;
//연속 입력임을 인식 (중간에 0이 있더라도 계속 입력 및 0을 인식한 순간 break 진행이 필요함)
public class Ex1071 {
    public static void main(String[] args){
        Function();
    }

    public static void Function(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch (a) {
            case 0:
                break;
            default:
                System.out.println(a);
                Function();
        }
    }
}