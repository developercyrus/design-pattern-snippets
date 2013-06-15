package design.pattern.bridge.a1.after;

public class XmasVersion extends AngryBee {

    public XmasVersion(Platform platform) {
        super(platform);
    }

    @Override
    public void play() {
        System.out.print("Playing AngryBee Xmas Version ");
        platform.control();
    }
}