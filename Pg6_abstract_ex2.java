abstract class One
{
	public One()
	{
		System.out.println("One");
	}
	abstract void message(String msg);
	abstract void dispay();
}
abstract class Two extends One
{
	public Two()
	{
		System.out.println("Two");
	}
	void message(String msg) {
		System.out.println("the message = " + msg);
	}	
}
class Three extends Two
{
	public Three()
	{
		System.out.println("Three");
	}
	@Override
	void dispay() {
		System.out.println("display");
	}	
}
class Four extends One
{
	public Four()
	{
		System.out.println("Four");
	}
	void message(String msg) {
		System.out.println("4 String = "+msg);
	}
	void dispay() {
		System.out.println(" 4 Class ");
	}
	
}
public class Pg6_abstract_ex2 {
	public static void main(String[] args) {
		Three ob = new Three();
		ob.message("hey did you watch Manifest");
		ob.dispay();
		System.out.println("__________________________");
		One ob1 = new Four();
		ob1.message("Sherlock?");
		ob1.dispay();
	}

}
