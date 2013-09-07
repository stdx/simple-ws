package org.stdx.ws.simple.impl;

import org.stdx.ws.simple.HelloWorldServiceSkeletonInterface;

import com.moodykettle.webservice.helloworld.SayHello;
import com.moodykettle.webservice.helloworld.SayHelloResponse;


/**
 * The Class SayHelloServiceImpl.
 */
public class SayHelloServiceImpl implements HelloWorldServiceSkeletonInterface {

	
	/* (non-Javadoc)
	 * @see com.foo.myservice.HelloWorldServiceSkeletonInterface#sayHello(com.moodykettle.webservice.helloworld.SayHello)
	 */
	public SayHelloResponse sayHello(SayHello sayHello) {

		SayHelloResponse response = new SayHelloResponse();
		response.setSayHelloReturn(sayHello(sayHello.getName()));

		return response;
	}

	
	/**
	 * Say hello.
	 *
	 * @param name the name
	 * @return the string
	 */
	private String sayHello(String name) {
		String to = "world";
		if (name != null || name.trim().length() != 0) {
			to = name;
		}
		return to;
	}

}