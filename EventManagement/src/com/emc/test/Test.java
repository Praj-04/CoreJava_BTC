package com.emc.test;

import com.emc.entities.Event;
import com.emc.entities.Organizer;
import com.emc.managers.EventManager;
import com.emc.managers.EventMangerImpl;
import com.emc.managers.EventMangerImpl2;

public class Test {

	public static void main(String[] args) {
		Organizer organizer = new Organizer();
organizer.setId(123l);
organizer.setName("Apple Inc");
System.out.println(organizer.getId());
System.out.println(organizer.getName());

Event event = new Event(456l,"iPhone100 Launch","grand launch");

System.out.println(event.getDescription());


EventManager em = new EventMangerImpl2();
 System.out.println(em.create(123456l).getName());
}

}
