package com.emc.manager;

import com.emc.dto.Event;

public class EventManagerInput implements EventManager{

	@Override
	public Event create(Long id) {
		//Event event = new Event(id, null, null); De esta o la otra manera puede ser
		return new Event(id, null, null);
	}

}
