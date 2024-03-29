package design.pattern.proxydynamic.a1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BirdProxy implements InvocationHandler { 
    private Logger logger = Logger.getLogger(this.getClass().getName()); 
    private Object delegate; 

    public BirdProxy(Object delegate) {
        this.delegate = delegate;
    }
    
    public static Object createProxy(Object delegate) {
        return Proxy.newProxyInstance(delegate.getClass().getClassLoader(), delegate.getClass().getInterfaces(), new BirdProxy(delegate));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null; 
        try { 
            logger.log(Level.INFO, "method starts..." + method); 
            result = method.invoke(delegate, args); 
            logger.log(Level.INFO, "method ends..." + method); 
        } catch (Exception e){ 
            logger.log(Level.INFO, e.toString()); 
        } 
        return result; 
    }
} 
