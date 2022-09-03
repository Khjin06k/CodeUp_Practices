import java.util.Scanner;
public class Ex1071 {
    /*public static void main(String[] args){

        Function();
    }

    public static void Function() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a != 0) {
            System.out.println(a);
            Function();
        }
    }*/
    //추후 재귀함수를 이용하여 문제를 해결할 수 있는지 생각 및 확인 필요

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int a = sc.nextInt();
            if(a==0){
                break;
            }
            System.out.println(a);
        }
    }
}