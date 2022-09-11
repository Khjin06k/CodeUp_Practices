import java.util.Scanner;

public class Ex1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //격자판 세로,가로 크기 입력
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[][] arr = new int[a][b];
        //막대의 개수 입력 (입력받을 개수 지정)
        int c = sc.nextInt();
        //막대의 개수만큼길이,방향(가로는 0, 세로는1),좌표(x,y)을 한줄에 입력
        int[] arr1 = new int[4];
        for (int j = 1; j <= c; j++) {
            for (int i = 0; i < 4; i++) {
                arr1[i] = sc.nextInt();
            }
            int d = arr1[2];
            int e = arr1[3];
            //가로 세로인지에 따라 a가 증가할지, b가 증가할지 결정
            for(int t=0; t<arr1[0]; t++) {
                if (arr1[1] == 0) {
                    arr[d - 1][e - 1 + t] = 1;
                } else {
                    arr[d - 1 + t][e - 1] = 1;
                }
            }
        }
        for (int j = 0; j < a; j++) {
            for (int i = 0; i < b; i++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println("");
        }
    }
}
