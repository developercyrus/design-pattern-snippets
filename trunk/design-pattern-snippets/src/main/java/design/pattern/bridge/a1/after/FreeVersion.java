package design.pattern.bridge.a1.after;

public class FreeVersion extends AngryBee {

    public FreeVersion(Platform platform) {
        super(platform);
    }

    @Override
    public void play() {
        System.out.print("Playing AngryBee Free Version ");
        platform.control();
    }
}