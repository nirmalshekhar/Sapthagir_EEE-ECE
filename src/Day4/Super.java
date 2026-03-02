package Day4;
class Apple
{
    String brand="Apple";
    Apple(){
        System.out.println("Apple COnstructor called");
    }
    void showBrand(){
        System.out.println("Brand: "+brand);
    }
}
class iphone extends Apple{
    String Brand="iphone 17";
    iphone(){
        super();//Calling parents constructor
        System.out.println("iphone construtor called");
    }
    void display(){
        System.out.println("Model:"+Brand);
        System.out.println("Company "+super.brand);//calling parents varaible
        super.showBrand();//calling parents methods
    }
}
public class Super {
    public static void main(String[] args) {
      iphone obj=new iphone();
      obj.display();
    }
}
