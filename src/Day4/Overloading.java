package Day4;
class Calculator{
    void add(){
        int a=10;
        int b=20;
        System.out.println("Sum = "+(a+b));
    }
    int add(int a ,int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    float add(float a,float b){
        return a+b;
    }
}
public class Overloading {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.add();
        System.out.println("Integers"+c.add(4,5));
        System.out.println("Double "+c.add(4.5,6.7));
        System.out.println("Float"+c.add(2.6f,4.6f));
    }
}
