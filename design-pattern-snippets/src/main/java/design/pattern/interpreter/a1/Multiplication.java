package design.pattern.interpreter.a1;

import java.util.Stack;

public class Multiplication implements Expression {
    @Override
    public void interpret(Stack<Integer> s)  {
        Integer a = s.pop();  
        Integer b = s.pop();            
        Integer product = b * a;
        System.out.println(b + "x" + a + "=" + product); 
        s.push(product); 
    }
}
