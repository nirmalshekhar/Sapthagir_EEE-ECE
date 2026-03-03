package Day5;
abstract class Shape{
    abstract void draw();//Abstract method without a method body
    void area(){//Non abstract method
        System.out.println("Area of a Shape");
    }
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drwaing a circle");
    }
}
public class AbstractionDemo {
    public static void main(String[] args) {
      Shape s=new Circle();//Object of derived class wrt Abstract class
      s.draw();
      s.area();
    }
}
