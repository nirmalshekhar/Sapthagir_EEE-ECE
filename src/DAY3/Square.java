package DAY3;
import java.util.Scanner;
public class Square {
   static int square(int n)
    {
        return n*n;
    }
    public static void main(String[] args) {
        Square ob=new Square();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(ob.square(n));//Calling static and non static
        System.out.println(square(n));//calling static method directly
    }
}
