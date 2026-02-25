package DAY3;
public class Avengers {
    String Name;//Instance Variable
    //Constructor
    Avengers(String Name){//Local Variable
        this.Name=Name;//this keyword
    }
    void display()
    {
        System.out.println("Tony Stark :"+Name);
    }
    public static void main(String[] args) {
        Avengers a1=new Avengers("Iron Man");
        a1.display();
    }
}
