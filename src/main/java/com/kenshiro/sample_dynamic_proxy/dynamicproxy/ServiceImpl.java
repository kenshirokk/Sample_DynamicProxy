package com.kenshiro.sample_dynamic_proxy.dynamicproxy;

public class ServiceImpl implements Service {

	@Override
	public String doSomething(String str) {
		System.out.println("ServiceImpl doSomething called");
		return str;
	}

}
