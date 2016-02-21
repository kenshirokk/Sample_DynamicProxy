package com.kenshiro.sample_dynamic_proxy.staticproxy;

public class StaticProxy {

	public static void main(String[] args) {
		
		ServiceProxy sp = new ServiceProxy(new ServiceImpl());
		String doSomething = sp.doSomething("hello world");
		System.out.println(doSomething);
	}
}
