package com.kenshiro.sample_dynamic_proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ServiceProxy implements InvocationHandler {
	private Object target;
	
	public ServiceProxy(Object object) {
		this.target = object;
	}
	public Object getProxy() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("pre service");
		Object result = method.invoke(target, args);
		System.out.println("post service");
		return result + " and proxy";
	}

}
