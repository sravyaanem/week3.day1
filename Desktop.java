package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("this method is on Desktop");
	}
	public static void main(String[] args) {
		Desktop des=new Desktop();
		des.desktopSize();
		des.computerModel();
	}

}
