package com.servletproject.app;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println();

		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8081);
		Context context = tomcat.addContext("", null);
		Tomcat.addServlet(context, "HelloServlet", new HelloServlet());

		context.addServletMappingDecoded("/hello", "HelloServlet");

		try {
			tomcat.start();
		} catch (LifecycleException e) {
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
		}

		tomcat.getServer().await();

	}
}
