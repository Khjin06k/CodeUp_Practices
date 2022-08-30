import java.util.Scanner;

public class EX1025 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String str[] = a.split("");

        System.out.println("["+Integer.parseInt(str[0]) *10000+"]");
        System.out.println("["+Integer.parseInt(str[1])*1000+"]");
        System.out.println("["+Integer.parseInt(str[2])*100+"]");
        System.out.println("["+Integer.parseInt(str[3])*10+"]");
        System.out.println("["+Integer.parseInt(str[4])+"]");
    }
}
