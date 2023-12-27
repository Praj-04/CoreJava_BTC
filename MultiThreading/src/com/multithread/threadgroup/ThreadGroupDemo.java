package com.multithread.threadgroup;

public class ThreadGroupDemo {

	public static void main(String[] args) {
System.out.println(Thread.currentThread().getThreadGroup().getName());
System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

ThreadGroup p = new ThreadGroup("Parent");
System.out.println(p.getName());


ThreadGroup c = new ThreadGroup(p,"Child");
System.out.println(c.getParent().getName());
System.out.println(c.getName());
	}

}
