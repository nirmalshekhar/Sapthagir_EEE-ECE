package DAY1;

public class Implicit {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);
        double d=a;//Implicit(Widening)
        System.out.println(d);
        int b=(int)d;//Explicit(narrowing)
        System.out.println(b);

    }
}
