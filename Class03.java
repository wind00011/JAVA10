package Java10;

class Caaa1 {
	public int num1;
	public int num2;

	public Caaa1() {
		num1 = 1;
		num2 = 1;
	}

	public Caaa1(int a, int b) {
		num1 = a;
		num2 = b;
	}
}

class Cbbb1 extends Caaa1 {
	public Cbbb1() {
	}
	public Cbbb1(int a, int b) {
		super(a, b);
	}

	public void show() {
		System.out.println("num1=" + num1);
		System.out.println("num2=" + num2);
	}
}

public class Class03 {
	public static void main(String args[]) {
		Cbbb1 bb1 = new Cbbb1();
		Cbbb1 bb2 = new Cbbb1(3,9);
		
		bb1.show();
		bb2.show();
	}
}