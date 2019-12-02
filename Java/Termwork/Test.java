import java.util.*;


public class Test
{
	public static void main(String args[])
	{

		B obj=new B();
		obj.add("a");
		obj.add("b");
		obj.add("c");
		obj.add(9);
		obj.display();

	}
}


class B
{
	static int m=0;

	Object o[]=new Object[10];

	void add(Object i)
	{
		o[m++]=i;
	}

	void display()
	{
		// Since o is an array , we can iterate over it
		for (int i=0;i<o.length;i++)
		{
			System.out.println(o[i]);
		}
	}
}
