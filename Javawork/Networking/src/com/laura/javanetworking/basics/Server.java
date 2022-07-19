package com.laura.javanetworking.basics;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {

		try {// Creando nuestro servidor con el puerto
			ServerSocket serverSocket = new ServerSocket(8080);
			System.out.println("Waiting for the client to connect on por 88");
			
			// escuchar las conexiones del cliente, cuando se establezca la conexion
			// devolvera esa conexion de socket.
			Socket socket = serverSocket.accept();
			System.out.println("Conection established");
			
			//recibir los datos del cliente y leyendolos
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String data = dis.readUTF();
			System.out.println("Data received: "+data);
			dis.close();
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
