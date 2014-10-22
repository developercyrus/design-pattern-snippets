package design.pattern.interpreter.a1;

import java.util.Stack;

public class Division implements Expression {
    @Override
    public void interpret(Stack<Integer> s)  {
        Integer a = s.pop();
        Integer b = s.pop();         
        Integer quotient = b / a;
        System.out.println(b + "/" + a + "=" + quotient);     
        s.push(quotient); 
    }
}
