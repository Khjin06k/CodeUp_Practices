import java.util.Scanner;

public class Ex1076 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);

        char i = 'a';
        //a부터 입력받은 알파벳까지의 출력 >> a에서 시작.
        // i++을 통해 1씩 증가하면서 알파벳도 같이 증가

        do{
            System.out.print(String.format("%c ", i));
            i++;
        } while(i<=a);
        //i와 a의 비교이기에 i++이 되면서 알파벳이 동일해 질때까지 반복 진행
    }
}
