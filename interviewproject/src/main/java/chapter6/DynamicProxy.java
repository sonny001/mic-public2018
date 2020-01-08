package chapter6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program microservice-project
 * @description: 动态代理
 * @author: sonny
 * @create: 2019/12/30 22:04
 */
public class DynamicProxy implements InvocationHandler {

    private Object target;

    public Object bind(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start log");
        Object result = method.invoke(target, args);
        System.out.println("end log");
        return result;
    }
}
