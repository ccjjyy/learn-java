package org.cjy.learning;

interface Network{
	public void browse();
}

class Real implements Network{
	// override
	public void browse(){
		System.out.println("we've got on line!");
	}
}

class Proxy implements Network{
	// properties
	private Network network;
	// constructors
	public Proxy(Network network){
		this.network = network;
	}
	// functions
	public void check(){
		System.out.println("check the user");
	}
	// override
	public void browse() {
		this.check();
		this.network.browse();
	}
	
}


public class ProxyDesign {

	public static void main(String[] args) {
		Network net = null;
		net = new Proxy(new Real());
		net.browse();
	}

}
