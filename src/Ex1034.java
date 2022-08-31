import java.util.Scanner;

public class Ex1034 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        int b = Integer.valueOf(a, 8);
        //valueOf 함수 : 받은 인자값을 number 객체형으로 변환하여 반환

        System.out.println(b);
    }
}
