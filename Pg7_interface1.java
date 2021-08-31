interface A1
{
	void sayit();
}
interface B1
{
	void sayit();
	void display();
}
class A_Implement implements A1
{
	public void sayit() {
		System.out.println("A interface implement");
	}
}
class AB_Implement implements A1,B1
{
	public void sayit() {
		System.out.println("AB interface implement");
	}	
	public void display()
	{
		System.out.println("DISPLAY");
	}
}
public class Pg7_interface1 {

	public static void main(String[] args) {
		A_Implement ob = new A_Implement();
		ob.sayit();
				
		AB_Implement ob1 = new AB_Implement();
		ob1.sayit();
		ob1.display();
		
		A1 ob2 = new A_Implement();
		ob2.sayit();
	}
}
