package Day5;
abstract class Appliance{
    Appliance(){
        System.out.println("Constructor inside Abstract class");
    }
    //abstract method(Without method body)
    abstract void turnOn();
    //Non abstract(With body)
    void plugIn(){
        System.out.println("Appliance is plugged in");
    }
}
class Fan extends Appliance{
    @Override
    void turnOn(){
        System.out.println("Fan is spinning");
    }
}
public class AbstractionDemo1 {
    public static void main(String[] args) {
      Appliance a=new Fan();
      a.plugIn();//Non abst meth of abstract class
       a.turnOn();
    }
}
