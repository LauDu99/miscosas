package com.laura.java8.methods.constructor;

public class Test {

	public static void main(String[] args) {
		//usando el construcotr con mapping
		MyInterface f1 = s -> new MyClass(s);
		f1.get("Using Lambda");
		//para usar el constructor con mapping
		MyInterface f2 = MyClass::new;
		f2.get("using the construcotr mapping");
	}

}
