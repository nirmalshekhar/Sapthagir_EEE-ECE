package DAY3;

public class Sum {//Blueprint or template
    int Add(int a,int b)
    {
        int add=a+b;
        return add;//function returning sum of two numbers
    }
    void display(){
        System.out.println("Hello Users");
    }
    public static void main(String[] args) {
        Sum ob=new Sum();//Allocated the memory
       // int n=ob.Add(5,6);//Function call
        //System.out.print(n);
        System.out.println(ob.Add(5,6));//Function call
        System.out.println(ob.Add(10,6));
        ob.display();//calling void function

    }
}
