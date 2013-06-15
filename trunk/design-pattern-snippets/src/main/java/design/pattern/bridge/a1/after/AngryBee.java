package design.pattern.bridge.a1.after;

public abstract class AngryBee {
    Platform platform;

    public AngryBee(Platform platform) {
        this.platform = platform;
    }

    public abstract void play();
}