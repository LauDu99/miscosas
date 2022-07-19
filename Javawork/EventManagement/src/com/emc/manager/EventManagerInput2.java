package com.emc.manager;

import com.emc.dto.Event;

public class EventManagerInput2 implements EventManager{

	@Override
	public Event create(Long id) {
		return new Event(id, "MACBook Launch", "New Generation macbooks");
	}

}
