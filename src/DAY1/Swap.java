package DAY1;

public class Swap {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("Before Swapping"+a+" "+b);
        //1st->Using Temp
        /*int temp;
        temp=a;
        a=b;
        b=temp;

        //2nd ->Using Arithmetic operator
        a=a+b;
        b=a-b;
        a=a-b;*/

        //3rd ->Bitwise Operator
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After Swapping"+a+" "+b);
    }
}
