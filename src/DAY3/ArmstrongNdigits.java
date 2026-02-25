package DAY3;
import java.util.Scanner;
public class ArmstrongNdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int count=0;
        //Count the no of digits
        while(temp>0)
        {
            count++;
            temp=temp/10;
        }
        temp=n;
        int sum=0;
        while(temp>0)
        {
            int d=temp%10;
            sum+=Math.pow(d,count);
            temp=temp/10;

        }
        if(n==sum)
        {
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not Armstrong");
        }


    }
}
