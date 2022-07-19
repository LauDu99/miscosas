package com.emc.test;

import com.emc.dto.Event;
import com.emc.dto.Organizer;
import com.emc.manager.EventManager;
import com.emc.manager.EventManagerInput;
import com.emc.manager.EventManagerInput2;

public class Test {

	public static void main(String[] args) {
		Organizer organizer = new Organizer();
		organizer.setId(123l);
		organizer.setName("Apple Inc");
		System.out.println(organizer);
		System.out.println(organizer.getName());
		
		Event event = new Event(1234l, "Iphone Launch", "Grand launch");
		System.out.println(event.getDescription());
		
		EventManager em = new EventManagerInput2();
		System.out.println(em.create(12345l).getId());
		
	}

}
