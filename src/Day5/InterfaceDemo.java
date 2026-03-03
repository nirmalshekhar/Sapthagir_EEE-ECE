package Day5;
interface Animal{
    void sound();//abstract method(No body)
    default void bite(){
        //default method is having Method body
        System.out.println("Animals Bites");
    }
}
class cat implements Animal{
    @Override
    public void sound(){
        System.out.println("Meow Meow");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
      Animal c=new cat();
      c.sound();
      c.bite();
    }
}
