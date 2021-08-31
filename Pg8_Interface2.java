interface Item1
{
	public static final int x = 0;
	default void disp()
	{
		System.out.println("ITEM1");
	}	
	void disp2();
}
interface Item2
{
	default void disp()
	{
		System.out.println("ITEM2");
	}
}
class Item1_implement implements Item1,Item2
{
	public void disp2() {
		System.out.println("disp2 " + x);
	}

	@Override
	public void disp() {
		Item1.super.disp();
	}
}
public class Pg8_Interface2 {
	public static void main(String[] args) {
		Item1_implement ob = new Item1_implement();
		ob.disp();
		ob.disp2();
	}
}
