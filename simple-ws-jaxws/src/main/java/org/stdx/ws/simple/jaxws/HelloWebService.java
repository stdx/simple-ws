package org.stdx.ws.simple.jaxws;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * The Interface HelloWebService.
 */
@WebService
public interface HelloWebService {
	
	/**
	 * Say hello.
	 *
	 * @param name the name
	 * @return the string
	 */
	String sayHello(@WebParam(name = "name") String name);
}
