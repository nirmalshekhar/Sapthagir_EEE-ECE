package Day4;
class Car
{
    void display(){
        System.out.println("Any Car Comapany");
    }
}
class Tata extends Car{
    void display1(){
        System.out.println("Tata Sons");
    }
}
class Curvv extends Tata{
    void display2(){
        System.out.println("Tata Curvv");
    }
}
public class MultiLevel {
    public static void main(String[] args) {
        Curvv c=new Curvv();
        c.display();
        c.display1();
        c.display2();
    }
}
