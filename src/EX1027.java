import java.util.Scanner;

public class EX1027 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String str[] = a.split("[.]");

        System.out.println(str[2]+"-"+str[1]+"-"+str[0]);

    }
}
