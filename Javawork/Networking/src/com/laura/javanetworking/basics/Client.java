package com.laura.javanetworking.basics;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {

			 
			try {
				Socket socket = new Socket("localhost", 8080);
				//cliente quiere escribir datos en el servidor 
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
				//escribiendo datos en el servidor
				dos.writeUTF("Java sockets are cool");
				//cerrando todo
				dos.close();
				socket.close();
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		
	}

}
