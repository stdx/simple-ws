package org.stdx.ws.simple.jaxws.impl;

import javax.jws.WebService;

import org.stdx.ws.simple.jaxws.HelloWebService;

@WebService(endpointInterface = "org.stdx.ws.simple.jaxws.HelloWebService")
public class HelloWebServiceImpl implements HelloWebService{

	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}

}
