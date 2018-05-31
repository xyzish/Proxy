package com.bjsxt.proxy;
import java.util.Random;

public class Tank implements Moveable{

	@Override
	public void move() {
		
		System.out.println("Tank Moving...");
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void stop() {
		System.out.println("Tank Stopping...");
		
	}

}
