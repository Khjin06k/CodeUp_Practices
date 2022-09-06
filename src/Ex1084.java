/*import java.util.Scanner;
//시간 초과 문제 해결 필요 >> Scanner의 입력 속도가 느리기에 BufferdRedader을 사용하면 시간 문제 해결 가능.
public class Ex1084 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = 0;
        for(int i = 0; i<a; i++){
            for(int j =0; j<b; j++) {
                for (int k = 0; k < c; k++) {
                    System.out.println(String.format("%d %d %d", i, j, k));
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex1084{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //출력
        String[] s = br.readLine().split(" "); //Sgring 입력이므로 형변환 필요

        int count = 0;
        for(int i=0;i<Integer.valueOf(s[0]); i++) {
            for(int j=0;j<Integer.valueOf(s[1]); j++) {
                for(int k=0;k<Integer.valueOf(s[2]); k++) {
                    bw.write(i+" "+j+" "+k+"\n");
                    count++;
                }
            }
        }
        bw.write(String.valueOf(count)); // 출력에 대해서도 형변환 필요
        bw.flush(); //버퍼 초기화
    }
}

