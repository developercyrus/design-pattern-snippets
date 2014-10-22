package design.pattern.interpreter.a1;

import java.util.Stack;

public class Addition implements Expression {
    @Override
    public void interpret(Stack<Integer> s)  {
        Integer a = s.pop();
        Integer b = s.pop();          
        Integer sum = a + b;
        System.out.println(a + "+" + b + "=" + sum);    
        s.push(sum); 
    }
}
