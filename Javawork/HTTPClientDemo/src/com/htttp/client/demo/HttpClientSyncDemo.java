package com.htttp.client.demo;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HttpClientSyncDemo {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
//status 200 = succesfull
		// creando el cliente
		HttpClient client = HttpClient.newHttpClient();
		// haciendo el request
		HttpRequest request = HttpRequest.newBuilder(new URI("http://fakerestapi.azurewebsites.net/api/v1/Authors"))
				.GET().build();

		//solicitud de publicacion htttp con un cuerpo que es json, y agregamos un tipo de contenido de encabezado porque es necesario para que el servidor sepa que puede manejar la respuesta
		HttpRequest.newBuilder(new URI("http://fakerestapi.azurewebsites.net/api/v1/Authors"))
				.POST(BodyPublishers.ofString("{\r\n" + "  \"id\": 0,\r\n" + "  \"idBook\": 0,\r\n"
						+ "  \"firstName\": \"string\",\r\n" + "  \"lastName\": \"string\"\r\n" + "}")).header("Content-Type", "aplication/json; v=1.0")
				.build();
		
		// utilizamos respuesta de cadena porque el manejador es de cadena
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		// estado del request
		System.out.println("Status: " + response.statusCode());
		// nos da el cuerpo de la respuesta
		System.out.println("Response: "+response.body());
		
		//mostrar encabezados en un map
		HttpHeaders headers = response.headers();
		System.out.println(headers.map());
	}

}
