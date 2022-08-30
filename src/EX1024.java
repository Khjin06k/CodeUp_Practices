import java.util.Scanner;

public class EX1024 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String str[] = a.split("");

        for(int i=0; i<str.length; i++){
            System.out.println("'" + str[i] + "'");
        }
    }
}
