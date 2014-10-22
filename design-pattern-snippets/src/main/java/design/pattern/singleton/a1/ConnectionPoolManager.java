package design.pattern.singleton.a1;


public class ConnectionPoolManager {    
    private static ConnectionPoolManager instance = null;
    private static int instantiateCount;
    private int connectCount;
    
    private ConnectionPoolManager() {
        instantiateCount = 0;
    }

    public static ConnectionPoolManager getInstance() {
        if (instance == null){
            instance = new ConnectionPoolManager();
            instantiateCount++;
        }
        return instance;
    }
    
    public void connect() {
        connectCount++;
    }

    public int getInstantiateCount() {
        return instantiateCount;
    }

    public int getConnectCount() {
        return connectCount;
    }
}
