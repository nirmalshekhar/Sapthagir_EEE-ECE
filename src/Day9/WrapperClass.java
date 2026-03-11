package Day9;

public class WrapperClass {
    public static void main(String[] args) {
        //AutoBoxing: Primitive to Wrapper Object
        int a=5;
        Integer obj=a;//AutoBoxing
        System.out.println("AutoBoxing : "+obj);

        //Auto Unboxing: Wrapper object to Primitive
        Integer b=10;
        int c=b;
        System.out.println("AutoUnboxing :"+c);

        //Wrapper class methods
        Integer num=50;
        //CompareTo [Greater(-1), same(0) ,less(1)
        System.out.println(num.compareTo(60));
        //equals
        System.out.println(num.equals(40));
        //max
        System.out.println(Integer.max(10,20));
        //min
        System.out.println((Integer.min(10,20)));
        //parseInt
        System.out.println(Integer.parseInt("3000"));
        //toString
        System.out.println(num.toString());
    }
}
