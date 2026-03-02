package Day4;

public class Constructor {
    String Name;
    Constructor(){
        this("Ms Dhoni");//Invoking parametrized to default
        System.out.println("Default construtor gets called");
    }
    Constructor(String Name){
        //this();//Invoke Default to Parametrized
        this.Name=Name;
    }
    void display(){
        System.out.println(Name);
    }
    public static void main(String[] args) {
        Constructor c1=new Constructor();
        c1.display();


    }
}
