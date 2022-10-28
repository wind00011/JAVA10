package Java10;

class CShape1 {
	public double area() {
		return 0.0;
	}
}

class CCircle1 extends CShape1 {
	double radius;

	public CCircle1(double r) {
		radius = r;
	}

	public double area() {
		return (3.14 * radius * radius);
	}
}

class CSquare1 extends CShape1 {
	double side;

	public CSquare1(double s) {
		side = s;
	}

	public double area() {
		return (side * side);
	}
}

class CTriangle2 extends CShape1 {
	double base, height;

	public CTriangle2(double b, double h) {
		base = b;
		height = h;
	}

	public double area() {
		return (base * height / 2);
	}

}

public class Class12 {
	public static void main(String args[]) {
		CShape1 shp[]=new CShape1[6];
		shp[0]=new CCircle1(1.0);
		shp[1]=new CCircle1(2.0);
		shp[2]=new CSquare1(1.0);
		shp[3]=new CSquare1(2.0);
		shp[4]=new CTriangle2(1, 4);
		shp[5]=new CTriangle2(2, 3);
		for(int i=0;i<shp.length;i++)
		System.out.println("area of shp["+i+"]="+shp[i].area());

		System.out.println("The largest area is "+largest(shp));
	}

	public static double largest(CShape1 a[]) {
		double max = a[0].area();
		for (int i = 0; i < a.length; i++)
			if (max < a[i].area())
				max = a[i].area();
		return max;
	}
}