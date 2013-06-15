package design.pattern.bridge.a1.after;

public class Froyo implements Platform {
    @Override
    public void control() {
        System.out.println("on Froyo");
    }
}