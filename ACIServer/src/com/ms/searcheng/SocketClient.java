package com.ms.searcheng;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ClassNotFoundException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.util.List;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;


public class SocketClient implements HttpHandler  {

    //static ServerSocket variable
    private static ServerSocket server;
    //socket server port on which it will listen
    private static int port = 9877;

    public static void main(String args[]) throws IOException, ClassNotFoundException{
        //create the socket server object
        server = new ServerSocket(port);
        //keep listens indefinitely until receives 'exit' call or program terminates
        while(true){
            System.out.println("Waiting for server data...");
            //creating socket and waiting for client connection
            Socket socket = server.accept();
            
	        
            //read from socket to ObjectInputStream object
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            //convert ObjectInputStream object to String
            String message = (String) ois.readObject();
            System.out.println("Message Received: " + message);

           // List serverRequest = new Splitter().splitMe(message);

           // System.out.println(serverRequest);
            //close resources
            ois.close();
            //oos.close();
            socket.close();
            //terminate the server if client sends exit request
            if(message.equalsIgnoreCase("exit")) break;
        }
        System.out.println("Shutting down Socket client!!");
        //close the ServerSocket object
        server.close();
    }
    
    public void handle(HttpExchange t) throws IOException {
    	
    	 
    	
    	        //Create a response form the request query parameters
    	
    	        URI uri = t.getRequestURI();
    	        System.out.println(uri);
    	
    /*	        String response = createResponseFromQueryParams(uri);
    	
    	        System.out.println("Response: " + response);
    
    	        //Set the response header status and length
    
    	        t.sendResponseHeaders(HTTP_OK_STATUS, response.getBytes().length);
    
    	        //Write the response string
    
    	        OutputStream os = t.getResponseBody();
    
    	        os.write(response.getBytes());*/
    
    	        //os.close();
    
    	    }


}
