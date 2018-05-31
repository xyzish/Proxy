package com.bjsxt.proxy;

public class TankLogProxy implements Moveable {
	public TankLogProxy(Moveable t) {
		super();
		this.t = t;
	}

	Moveable t;

	@Override
	public void move() {
		System.out.println("Tank Start...");
		t.move();
		System.out.println("Tank Stop...");
		
	}

	@Override
	public void stop() {
		System.out.println("Tank Start...");
		t.stop();
		System.out.println("Tank Stop...");
		
	}

}
