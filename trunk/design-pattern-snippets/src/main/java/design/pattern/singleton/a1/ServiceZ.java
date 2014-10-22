package design.pattern.singleton.a1;

public class ServiceZ implements Service {    
    private final ConnectionPoolManager manager = ConnectionPoolManager.getInstance();
    
    @Override
    public void doSomething() {
        manager.connect();
        System.out.println("instaniate count: " + manager.getInstantiateCount());
        System.out.println("connect count: " + manager.getConnectCount());
    }
}
