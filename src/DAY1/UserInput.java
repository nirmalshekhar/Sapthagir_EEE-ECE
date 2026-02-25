package DAY1;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*System.out.println("Enter a number");
        int a=sc.nextInt();
        System.out.println(a);

        System.out.println("Enter a Paragraph");
        String b=sc.nextLine();
        System.out.println(b);*/

        System.out.println("Enter a Character");
        char ch=sc.next().charAt(0);
        System.out.println(ch);

    }
}
