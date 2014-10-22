package design.pattern.singleton.a1;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        
        /*
             prevents other objects from instantiating their own copies of the Singleton object, ensuring that all objects access the single instance (to save resources purpose).         
         */
        
        List<Service> services = new ArrayList<Service>();
        services.add(new ServiceA());        
        services.add(new ServiceB());
        services.add(new ServiceZ());
        
        for (Service service : services) {
            service.doSomething();
        }              
    }
}
