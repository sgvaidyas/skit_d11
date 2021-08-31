class Myclass
{
	int x,y,z,sum;
	void add(int a,int b)
	{
		x=a;
		y=b;
		sum = a+b;
		System.out.println("Overload 2  param = "+sum);		
	}
	void add(int a,int b,int c)
	{
		x=a;
		y=b;
		z=c;
		sum = a+b+c;
		System.out.println("Overload 3 param = "+sum);		
	}
	int add1(int a,int b)
	{
		return a+b;
	}
	int add1(int a,int b,int c)
	{
		return a+b+c;
	}
}
public class Pg1_overload {
	public static void main(String[] args) {
		Myclass ob = new Myclass();
		ob.add(22,3);
		ob.add(2, 3,6);
		System.out.println(ob.add1(4, 5));
		System.out.println(ob.add1(7, 4,5));

	}

}
