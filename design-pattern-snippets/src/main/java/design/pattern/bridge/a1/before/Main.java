package design.pattern.bridge.a1.before;

public class Main {
    public static void main(String[] args) {
        AngryBee ffv = new FroyoFreeVersion();
        AngryBee fxv = new FroyoXmasVersion();
        AngryBee gfv = new GingerbreadFreeVersion();
        AngryBee gxv = new GingerbreadXmasVersion();
        
        ffv.play();
        fxv.play();
        gfv.play();
        gxv.play();
    }
}
