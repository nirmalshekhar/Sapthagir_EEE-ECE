package DAY1;
import java.util.Scanner;
public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch(n){
            case 1: System.out.println("One");break;
            case 2: System.out.println("Two");break;
            default:
                System.out.println("Invalid");
        }

    }
}
