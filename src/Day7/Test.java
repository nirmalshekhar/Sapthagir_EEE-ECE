package Day7;
//Case 3: Object Created inside a method-locally defined
public class Test {
    static void display(){
        Test t1=new Test();
        System.out.println(t1);
    }
     //System.out.println(t1);
    public static void main(String[] args) {
        Test t=new Test();
        System.out.println(t);
        t.display();
//Case 4: Anonymous Object- donot have object reference
        new Test();

    }
}
