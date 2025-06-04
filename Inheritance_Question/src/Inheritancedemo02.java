//Single level Inheritance

class Super{
	private int x;
	private int y;
	
	public void setData(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
		
	}
}
class Sub extends Super{
	public void getData() {
		System.out.println("x value is :"+getX());
		System.out.println("y value is :"+getY());
	}
}





public class Inheritancedemo02 {

	public static void main(String[] args) {
		Sub s1 = new Sub();
		s1.setData(100, 200);
		s1.getData();

	}
	/*Here with the help of encapsulation we can access private data of super class in sub class*/

}
