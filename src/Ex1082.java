import java.util.Scanner;

public class Ex1082 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        String a = sc.next();
        int b = Integer.parseInt(a,16);

        for(int i = 1; i<16; i++){
            int result = i*b;
            System.out.println(String.format(a+("*%X=%X"),i,result));
        }
    }
}