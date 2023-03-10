package Stacks;
import java.util.*;

public class BasicStack {
   static class Pair{
        int a;
        int b;
        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
        Pair()
        {
            this.a=0;
            this.b=0;
        }

    }
    public static void main(String[] args)
    {
        // Stack<Integer> stack = new Stack<>();
        // stack.push(100);
        
        // System.out.println(stack.peek());
        // System.out.println(stack.pop());
        // System.out.println(stack.size());
        Stack<Pair> st=new Stack<>();
        st.push(new Pair(5,6));
        st.push(new Pair(7,8));
        st.push(new Pair(9,10));
        st.push(new Pair(11,12));
        System.out.println(st.peek().a + " " + st.peek().b );
        st.pop();
        Pair p=st.peek();
        System.out.println(p.a + " " + p.b );
        System.out.println(st.isEmpty());
        System.out.println(st.size());

    }
}
