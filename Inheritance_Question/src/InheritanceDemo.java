
//Single level inheritance
class Father{
	public void house() {
		System.out.println("3 bhk house");
	}
}
class son extends Father{
	public void car() {
		System.out.println("audi car");
	}
}




public class InheritanceDemo {

	public static void main(String[] args) {
		son son = new son();
		son.car();
		son.house();

	}
	/*Note : in inhritance we should always create the object for more specialized sub class*/

}
