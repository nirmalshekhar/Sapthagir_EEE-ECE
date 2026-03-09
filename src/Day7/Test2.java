package Day7;
//Case 5: island of isolation
public class Test2 {
    Test2 ref;//Instance variable
    public static void main(String[] args) {
        Test2 t1=new Test2();
        Test2 t2=new Test2();
        System.out.println(t1+" "+t2);

        t1.ref=t2;
        t2.ref=t1;
        System.out.println(t1.ref);
        System.out.println(t2.ref);
        t1=null;
        t2=null;
    }
}
