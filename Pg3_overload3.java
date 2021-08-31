class B
{
	void add(int a,double b)
	{
		System.out.println(a+b);
	}
	void add(double a, int b)
	{
		System.out.println(a+b);
	}
}
public class Pg3_overload3 {

	public static void main(String[] args) {
		B ob = new B();
		//ob.add(77,8);
	}

}
