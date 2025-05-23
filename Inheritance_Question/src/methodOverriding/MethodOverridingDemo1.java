package methodOverriding;

class Alpha{
	public String toString() {
		return "Hyderabad";
	}
} 
class Beta extends Alpha {
	public String toString() {
		System.out.println(super.toString());
		return"India";
	}
}

public class MethodOverridingDemo1 {

	public static void main(String[] args) {
		Beta b= new Beta();
		System.out.println(b);
	}

}
