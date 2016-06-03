package com.ms.searcheng;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;


@SuppressWarnings("restriction")
public class SimpleHttpServer {

	private HttpServer httpServer;
	private static String serviceName;
	private static String serverName;
	private static int serverPort;

	/**
	 * Instantiates a new simple http server.
	 *
	 * @param port the port
	 * @param context the context
	 * @param handler the handler
	 */
	
	public SimpleHttpServer() {
		super();
	}
	
	public SimpleHttpServer(int clienntPort, String context, HttpHandler handler) {
		try {
			//Create HttpServer which is listening on the given port 
			httpServer = HttpServer.create(new InetSocketAddress(clienntPort), 0);
			//Create a new context for the given context and handler
			httpServer.createContext(context, handler);
			//Create a default executor
			httpServer.setExecutor(null);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public int getServerPort() {
		return serverPort;
	}

	public void setServerPort(int serverPort) {
		this.serverPort = serverPort;
	}

	/**
	 * Start.
	 */
	public void start() {
		this.httpServer.start();
	}

}
