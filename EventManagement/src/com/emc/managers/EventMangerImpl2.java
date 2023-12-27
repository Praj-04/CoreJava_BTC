package com.emc.managers;

import com.emc.entities.Event;

public class EventMangerImpl2 implements EventManager {

	@Override
	public Event create(Long id) {
		return new Event(id, "MacBook launch", "new generation");
		 
	}

}
