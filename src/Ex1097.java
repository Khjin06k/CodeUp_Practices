import java.util.Scanner;
//십자뒤집기란 행과 열을 입력받은 후 해당 행의 모든 것을 반대로, 해당 열의 모든 것을 반대로 뒤집는 것을 의미
//따라서 입력받은 해당 좌표값은 변화가 없음.

public class Ex1097 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[19][19];
        //전체 바둑알의 상황을 입력
        for(int j = 0; j<19; j++){
            for(int t = 0; t<19; t++){
                arr[j][t] = sc.nextInt();
            }
        }
        //십자 뒤집기 진행하기 전 입력 횟수와 좌표를 입력
        int a = sc.nextInt(); //입력 횟수 입력
        for(int i = 0; i<a; i++) { //뒤집기를 할 좌표 입력
            int b = sc.nextInt();
            int c = sc.nextInt();

            //십자뒤집기 진행
            for(int t = 0; t<19; t++){
                for(int j = 0; j<19; j++){
                    //행 뒤집기 진행
                    if(arr[b-1][j] == 0){
                        arr[b-1][j] = 1;
                    } else{
                        arr[b-1][j] = 0;
                    }
                    //열 뒤집기 진행
                    if(arr[t][c-1]==0){
                        arr[t][c-1] = 1;
                    }else{
                        arr[t][c-1] = 0;
                    }
                }
            }
        }
        for(int j = 0; j<19; j++){
            for(int t = 0; t<19; t++){
                System.out.print(arr[j][t]);
            }
            System.out.println("");
        }

    }
}
