package Day11;
import java.util.Stack;
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("Stack :"+st);
        System.out.println("Top Most element :"+st.peek());
        System.out.println("Popped element :"+st.pop());
        System.out.println(st);
        System.out.println("Position of :"+st.search(10));
        System.out.println("check full/empty :"+st.isEmpty());
        System.out.println("Size :"+st.size());

    }
}
