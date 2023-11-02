package com.practice.javaoops;

interface WhatsappCalls{
	
	void call();
	void mute();
	void disconnect();
}

class Voicecall implements WhatsappCalls{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Voicecall connected.");
		
	}

	@Override
	public void mute() {
		// TODO Auto-generated method stub
		System.out.println("Voicecall muted.");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Voicecall disconnectd.");
		
	}
	
}

class Videocall implements WhatsappCalls{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Videocall connected");
		
	}

	@Override
	public void mute() {
		// TODO Auto-generated method stub
		System.out.println("Videocall muted");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Videocall disconnected");
		
	}
	
}

public class AbstractionTwo {
	
	public static void main(String[] args) {
		
		/*Voicecall v1 = new Voicecall();
		v1.call();
		v1.mute();
		v1.disconnect();
		
		System.out.println();
		
		Videocall v2 = new Videocall();
		v2.call();
		v2.mute();
		v2.disconnect();
		
		System.out.println();*/
		
		WhatsappCalls v = new Voicecall();
		v.call();
		v.mute();
		v.disconnect();
		
		v = new Videocall();
		v.call();
		v.mute();
		v.disconnect();
		
		
	}

}
