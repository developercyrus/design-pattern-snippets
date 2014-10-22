package design.pattern.interpreter.a1;

import java.util.Stack;

public interface Expression {
    public void interpret(Stack<Integer> s);
}
