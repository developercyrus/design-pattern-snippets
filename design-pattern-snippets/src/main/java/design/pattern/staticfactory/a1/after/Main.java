package design.pattern.staticfactory.a1.after;


public class Main {
    /*
        Advantages:
        One advantage of static factory methods is that, unlike constructors, they have names.
        A second advantage of static factory methods is that, unlike constructors, they are not required to create a new object each time they're invoked.
        A third advantage of static factory methods is that, unlike constructors, they can return an object of any subtype of their return type.
        A fourth advantage of static factory methods is that they reduce the verbosity of creating parameterized type instances.
        
        Disadvantages:
        The main disadvantage of providing only static factory methods is that classes without public or protected constructors cannot be subclassed.
        A second disadvantage of static factory methods is that they are not readily distinguishable from other static methods.
        
        Reference: Effective Java, Joshua Bloch, Edition 2, pg: 5-10
     */
    
    public static void main(String[] args) {        
        RandomIntGenerator randomBetween = RandomIntGenerator.between(1000, 5000);
        RandomIntGenerator randomBiggerThan = RandomIntGenerator.biggerThan(5000);
        RandomIntGenerator randomSmallerThan = RandomIntGenerator.smallerThan(5000);
        
        System.out.println(randomBetween.next());
        System.out.println(randomBiggerThan.next());
        System.out.println(randomSmallerThan.next());
    }

}
