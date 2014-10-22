package design.pattern.interpreter.a1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostfixArithmeticParser {
    private final List<Expression> tree = new ArrayList<Expression>(); 
 
    public PostfixArithmeticParser(String s) {
        for (String token : s.split(" ")) {
            if (token.equals("+")) {
                tree.add(new Addition());
            }
            else if (token.equals("-")) {
                tree.add(new Subtraction());
            }
            else if (token.equals("*")) {
                tree.add(new Multiplication());
            }
            else if (token.equals("/")) {
                tree.add(new Division());
            }
            else {                     
                tree.add(new Operand(Integer.valueOf(token)) );
            }
        }
    }
 
    public int calculate() {
        Stack<Integer> context = new Stack<Integer>(); 
        for (Expression expression : tree) {
            expression.interpret(context);
        }
        return context.pop();
    }
}

