package com.laura.java1314;

public class SwitchExpressionDemo {

	public static void main(String[] args) {

		int key =1;
		
		String result = switch (key) {
		case 1: {
			//ya no es break
			yield "Choice 1";
		}
		default:
			yield "Invalid exception";
		};
		System.out.println(result);
		
		int choice =1;
		
		String response = switch (choice) {
		case 1 ->{
			yield "Dont have money";
		}
		case 2 ->{
			yield "Get a loan";
		}
		case 3->{
			yield"Do you have money?";
		}
		
		default ->
		throw new IllegalArgumentException("Unexpected value: " + choice);
		};
		System.out.println(response);
	}

}
