package design.pattern.interpreter.a1;

import java.util.Stack;

public class Operand implements Expression {
    private final int value;
    
    public Operand(int value) { 
        this.value = value; 
    }
    
    @Override
    public void interpret(Stack<Integer> s)  { 
        s.push(value); 
    }
}
