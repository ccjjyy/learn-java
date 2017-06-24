package org.cjy.learning;

interface Window{
	public void open();
	public void close();
	public void activated();
	public void iconified();
	public void deiconified();
}

abstract class WindowAdapter implements Window{
	public void open(){};
	public void close(){};
	public void activated(){};
	public void iconified(){};
	public void deiconified(){};
}

class WindowImpl extends WindowAdapter{
	public void open(){
		System.out.println("window open");
	}
	public void close(){
		System.out.println("window close");
	}
}


public class AdapterDesign {

	public static void main(String[] args) {
		Window win = new WindowImpl();
		win.open();
		win.close();
	}

}
