package org.cjy.learning;

interface USB{
	public void start();
	public void stop();
}

class Computer{
	public static void plugin(USB usb){
		usb.start();
		usb.stop();
	}
}

class Flash implements USB{
	public void start(){
		System.out.println("Flash working");
	}
	public void stop(){
		System.out.println("Flash stopping");
	}
}

class Print implements USB{
	public void start(){
		System.out.println("Print working");
	}
	public void stop(){
		System.out.println("Print stopping");
	}
}



public class StandardDesign {

	public static void main(String[] args) {
		Computer.plugin(new Flash());
		Computer.plugin(new Print());
	}

}
