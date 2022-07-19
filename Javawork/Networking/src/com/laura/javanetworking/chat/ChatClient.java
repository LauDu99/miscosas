package com.laura.javanetworking.chat;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ChatClient {

	public static void main(String[] args) {

		try (Socket socket = new Socket("localhost", 9090);
				// System.out.println("Server is ready to chat");
				// creando la entrada y salida de datos
				DataInputStream in = new DataInputStream(socket.getInputStream());
				DataOutputStream out = new DataOutputStream(socket.getOutputStream());

				// leer los datos de la consola, buffer sirve para simplificar la lectura de
				// datos
				// pueda suceder en la consola
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {

			String messageReceved = "", messageTosend = "";

			while (true) {
				// usuario escribe el mensaje
				messageTosend = br.readLine();
				// lo enviamos al servidor
				out.writeUTF(messageTosend);
				out.flush();
				if (messageTosend.equals("exit")) {
					break;
				}
				messageReceved = in.readUTF();
				System.out.println("server says: " + messageReceved);

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
