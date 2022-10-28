package Java10;

class Caaa3 {
	private int num;

	public void display() {
		System.out.println("printed from Caaa class");
	}
}

class Cbbb3 extends Caaa3 {
	public void display() {
		System.out.println("printed from Cbbb class");
	}
}

public class Class09 {
	public static void main(String args[]) {
		Cbbb3 bb = new Cbbb3();
		bb.display();
	}
}