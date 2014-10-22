package design.pattern.interpreter.a1;

import java.util.Stack;

public class Subtraction implements Expression {
    @Override
    public void interpret(Stack<Integer> s)  { 
        Integer a = s.pop();  
        Integer b = s.pop();
        Integer difference = -a + b;   
        System.out.println(b + "-" + a + "=" + difference); 
        s.push(difference); 
    }
}
