package com.ms.searcheng;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;


@SuppressWarnings("restriction")
public class HttpRequestHandler implements HttpHandler {
	
	private static final int HTTP_OK_STATUS = 200;
	
		
	public void handle(HttpExchange t) throws IOException {

		//Create a response form the request query parameters
		URI uri = t.getRequestURI();
		//System.out.println(splitMe(uri));
		List response = splitMe(uri);
		t.sendResponseHeaders(HTTP_OK_STATUS, response.toString().getBytes().length);
		OutputStream os = t.getResponseBody();
	    os.write(response.toString().getBytes());
	    os.close();
	}
	
		
	@SuppressWarnings({ "rawtypes", "unchecked"})
	private List splitMe(URI uri) {
		
		SimpleHttpServer simpleHttpServer = new SimpleHttpServer();
		String serviceName = simpleHttpServer.getServiceName();
		String serverName = simpleHttpServer.getServerName();
		int serverPort = simpleHttpServer.getServerPort();
		String query = uri.getQuery();
		  List uriString = new ArrayList();
		    String[] ampersandSplit = query.split("&");
		    String[] equalSplit = null;

		    for(String aS : ampersandSplit) {
		      if(aS.contains("=")) {
		        equalSplit = aS.split("=");
		        for(String eS : equalSplit) {
		        	uriString.add(eS);
		        }
		      }
		    }
		    Map urlMap = new HashMap();
		    for(int i = 0; i < uriString.size();i++ ) {
		    	if(uriString.get(i).equals("action")) {
		    		urlMap.put(uriString.get(i), uriString.get(++i));		    		
		    	}else if(uriString.get(i).equals("text")) {
		    		urlMap.put(uriString.get(i), uriString.get(++i));		    		
		    	}else if(uriString.get(i).equals("databasematch")) {
		    		urlMap.put(uriString.get(i), uriString.get(++i));		    		
		    		
		    		
		    	}
		    }
		    System.out.println(urlMap.keySet());
		    System.out.println(urlMap.get("action"));
		    System.out.println(urlMap.get("text"));
		    System.out.println(urlMap.get("databasematch"));
		    System.out.println("ServiceName " + serviceName);
		    System.out.println(serverName);
		    System.out.println(serverPort);
		    System.out.println("This is a Map: " +urlMap);
		    return uriString;
	}
	
}
