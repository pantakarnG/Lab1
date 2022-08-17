
public class Triangle extends Shape {

	private int base;
	private int height;

	public Triangle() {
		this.base = 0;
		this.height = 0;
	}

	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	public double getArea() {
		return (base * height) / 2;
	}
	public String toStroing() {
		return "Area : "+getArea();
	} 
}
