package com.laura.spring.springcore.propertyplaceholder;

public class MyDAO {

	private String url;

	public MyDAO(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "MyDAO [url=" + url + "]";
	}

}
