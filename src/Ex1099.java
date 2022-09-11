//코드 이해 필요
import java.util.Scanner;

public class Ex1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //미로 입력 받기
        int[][] arr = new int[11][11];
        for (int i=1; i<=10; i++) {
            for (int j=1; j<=10; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //시작 위치 설정 (개미집 위치인 2/2로 설정)
        int x = 2;
        int y = 2;
        while (true) {
            if (arr[x][y] == 0) { //0인 곳은 이동이 가능
                arr[x][y] = 9;//이동 후 경로에는 9를 설정
                y ++; //이동 후 다음 경로를 위해 ++로 이동
            }
            if (arr[x][y] == 1) { //1인곳은 이동 불가능
                y--;//아래로 더이상 이동이 불가능하기 때문에 위로 후퇴
                x++; //처음 if문에 의해 세로 이동은 완료되었기에 가로 이동을 위해 x를 ++함
            }
            if (arr[x][y] == 2) { //2를 만난다면 멈춤
                arr[x][y] = 9; //2인 곳으로 이동한 것이기에 이동 경로 9를 설정
                break; //멈춤
            } else if (arr[x][y+1] == 1 && arr[x+1][y] == 1) { //만약 아래,오른쪽 모두 1일 경우 더이상 이동이 불가능
                if (arr[x][y] == 0)
                    arr[x][y] = 9;
                break;//멈춤
            }
        }
        //개미가 이동한 경로 출력
        for (int i=1; i<=10; i++) {
            for (int j=1; j<=10; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}