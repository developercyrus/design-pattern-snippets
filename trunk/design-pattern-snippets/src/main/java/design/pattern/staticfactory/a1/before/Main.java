package design.pattern.staticfactory.a1.before;

public class Main {

    public static void main(String[] args) {        
        RandomIntGenerator randomBetween = new RandomIntGenerator(1000, 5000);
        RandomIntGenerator randomBiggerThan = new RandomIntGenerator(5000, Integer.MAX_VALUE);
        RandomIntGenerator randomSmallerThan = new RandomIntGenerator(0, 1000);
        
        System.out.println(randomBetween.next());
        System.out.println(randomBiggerThan.next());
        System.out.println(randomSmallerThan.next());
    }
}





