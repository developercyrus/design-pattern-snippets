package design.pattern.staticfactory.a1.before;

import java.util.Random;

public class RandomIntGenerator {
    private final int min;
    private final int max;

    public RandomIntGenerator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int next() {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;       
    }
}
