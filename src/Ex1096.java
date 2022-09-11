import java.util.Scanner;

public class Ex1096 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[19][19];

        int a = sc.nextInt(); //입력받을 갯수 입력
        for(int i = 0; i<a; i++){//위에서 입력받은 수만큼 반복 진행
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr[b-1][c-1] = 1;
        }
        for(int j = 0; j<19; j++){
            for(int t = 0; t<19; t++){
                System.out.print(arr[j][t]+" ");
            }
            System.out.println("");
        }
    }
}
