
public abstract class Shape {
	protected String color;

	abstract public double getArea();

	public void setColor(String color) {
		this.color = color;
		
	}

	public String toString() {
		if (color == null) {
			color = "red";
			return "Area: "+getArea() + "Color :" + color;
		} else {
			return "Area: "+getArea() + "Color :" + color;
		}
	}
	
}
