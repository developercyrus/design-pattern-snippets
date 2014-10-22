package design.pattern.interpreter.a1;


public class Main {
    public static void main(String[] args) {
        String expression = "100 42 4 3 7 * - + /";
        PostfixArithmeticParser p = new PostfixArithmeticParser(expression);
        System.out.println("'" + expression +"' equals " + p.calculate());
    }
}
