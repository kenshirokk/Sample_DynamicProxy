package com.kenshiro.sample_dynamic_proxy.staticproxy;

public class ServiceProxy implements Service {

	private Service service;
	
	public ServiceProxy(Service service) {
		this.service = service;
	}
	
	@Override
	public String doSomething(String str) {
		
		System.out.println("pre-service");
		String doSomething = service.doSomething("from proxy str");
		System.out.println("post-service");
		
		return doSomething;
	}

}
