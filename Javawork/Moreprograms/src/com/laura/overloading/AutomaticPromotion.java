package com.laura.overloading;

public class AutomaticPromotion {

		public void print(int i) {//Si son iguales tiene que tener valores de variables equivalentes 
			System.out.println("Integer Version: "+i);
		}
		
		public void print(float i) {
			System.out.println("Float Version: "+i);
		}
		
	public static void main(String[] args) {
		AutomaticPromotion ap = new AutomaticPromotion();
		ap.print(3);
		ap.print(5.2f);
	}

}
