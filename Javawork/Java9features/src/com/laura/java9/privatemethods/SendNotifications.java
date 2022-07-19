package com.laura.java9.privatemethods;

public interface SendNotifications {

	static void SendingNotifications() {
		establishConnection();
		System.out.println("Sending notifications");
	}
	
	default void SendingNotification() {
		establishConnection();
		System.out.println("Sending notification");
	}
	
	private static void establishConnection() {
		System.out.println("Establishing a connection");
	}
}
