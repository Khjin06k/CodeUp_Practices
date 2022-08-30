import java.util.Scanner;

public class EX1026 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String str[] = a.split(":");

        if(str[1].equals("00")){
            System.out.println("0");
        }else{
            System.out.println(str[1]);
        }

    }
}
