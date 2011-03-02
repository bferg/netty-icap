package ch.mimo.netty.handler.codec.icap;

import org.jboss.netty.handler.codec.http.HttpMethod;

// TODO this wrapper introduced the icap specific request methods as httpmethod
// instances.
public class IcapMethods {

	/**
	 * Request Modification
	 */
	public static final HttpMethod REQMOD = new HttpMethod("REQMOD");
	
	/**
	 * Response Modification
	 */
	public static final HttpMethod RESPMOD = new HttpMethod("RESPMOD");
	
	/**
	 * learn about configuration
	 */
	public static final HttpMethod OPTIONS = HttpMethod.OPTIONS;
}