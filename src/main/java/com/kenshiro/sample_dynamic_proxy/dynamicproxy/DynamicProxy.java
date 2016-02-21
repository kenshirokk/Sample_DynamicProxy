package com.kenshiro.sample_dynamic_proxy.dynamicproxy;

public class DynamicProxy {

	public static void main(String[] args) {
		
		Service service = new ServiceImpl();
		ServiceProxy serviceProxy = new ServiceProxy(service);
		Service proxy = (Service) serviceProxy.getProxy();
		String doSomething = proxy.doSomething("hello world");
		System.out.println(doSomething);
	}
}
