package methodOverloading;

class Additional{
	public Additional(int x, int y) {
		this(2.3F,7.8F);
		System.out.println("sum of two integer is "+(x+y));
	}
	
	public Additional(float x, float y) {
		this("Data","base");
		System.out.println("sum of two float is"+(x+y));
	}
	public Additional(String x, String y)
	{
		super();
		System.out.println("Concatenation of two String is :"+(x+y));
	}
}

public class OverloadDemo01 {

	public static void main(String[] args) {
	new Additional(100,200);

	}

}
