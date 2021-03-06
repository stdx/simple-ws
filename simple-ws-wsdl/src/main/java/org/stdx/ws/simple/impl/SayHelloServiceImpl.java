package org.stdx.ws.simple.impl;

import org.stdx.webservice.helloworld.SayHello;
import org.stdx.webservice.helloworld.SayHelloResponse;
import org.stdx.ws.simple.HelloWorldServiceSkeletonInterface;

/**
 * The Class SayHelloServiceImpl.
 */
public class SayHelloServiceImpl implements HelloWorldServiceSkeletonInterface {

	private static final String WORLD = "world";

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.stdx.ws.simple.HelloWorldServiceSkeletonInterface#sayHello(org.stdx
	 * .webservice.helloworld.SayHello)
	 */
	public SayHelloResponse sayHello(SayHello sayHello) {

		SayHelloResponse response = new SayHelloResponse();
		response.setSayHelloReturn(sayHello(sayHello.getName()));

		return response;
	}

	/**
	 * Say hello.
	 * 
	 * @param name
	 *            the name
	 * @return the string
	 */
	private String sayHello(String name) {
		String to = WORLD;
		if (name != null && name.trim().length() != 0) {
			to = name;
		}
		return "hello " + to;
	}

}
