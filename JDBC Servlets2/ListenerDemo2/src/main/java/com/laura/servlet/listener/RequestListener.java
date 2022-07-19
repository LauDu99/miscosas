package com.laura.servlet.listener;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class RequestListener
 *
 */
@WebListener
public class RequestListener implements ServletRequestListener {

	public void requestDestroy(ServletRequestEvent event) {
		System.out.println("Request destroy");

	}

	public void requestInitialized(ServletRequestEvent event) {
		System.out.println("Request created");

	}

}
