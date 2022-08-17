
public class Testdriver {
	/**
	 * *@param args
	 */

	public static void main(String[] args) {
		Shape r1 = new Rectangle(6, 5);
		//System.out.println(r1.toString());
		r1.setColor("green");
		System.out.println(r1);
		
		Shape r2 = new Rectangle(6,5);
		System.out.println(r2);
		
		System.out.println(r1.equals(r2));
		
		r2 = r1;// or r1 = r2;
		System.out.println(r1.equals(r2));
		r2.setColor("Black");// or r1
		System.out.println(r1);
		System.out.println(r2);
		
		//System.out.println("Rectangle Area = " + r1.getArea());
		//Triangle t1 = new Triangle(6, 5);
		//t1.setColor("blue");
		//System.out.println(t1);
		//System.out.println("Triangle Area = " + t1.getArea());
	}
}