package com.ms.searcheng;


public class HttpServerTest {

	private static final String CONTEXT = "/searcheng";
	private static final int PORT = 2355;

	public static void main(String[] args) throws Exception {
		
		String serviceName = args[0];
		String serverName = args[1];
		int serverPort = Integer.parseInt(args[2]);
		int clientPort = Integer.parseInt(args[3]);
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
		

		// Create a new SimpleHttpServer
		SimpleHttpServer simpleHttpServer = new SimpleHttpServer(clientPort,  CONTEXT,
				new HttpRequestHandler());
		simpleHttpServer.setServerName(serverName);
		simpleHttpServer.setServiceName(serviceName);
		simpleHttpServer.setServerPort(serverPort);
		

		// Start the server
		simpleHttpServer.start();
		System.out.println("Client started and is listening on port "+ PORT);
	}
	
	

	
}
