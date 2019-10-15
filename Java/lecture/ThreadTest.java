public class ThreadTest

{
	public static void main(String[] args) {
			
			new B().start();
			new C().start();
	}
}


class D
{
    static void print(int n)
	{
		for(int i=0;i<=10;i++)
		{
			
			System.out.println(n*i);
		}
	}
}

class B extends Thread 
{
	public void run()
	{
		D.print(7);
	}
}


class C extends Thread 
{
	public void run()
	{
		D.print(11);
	}
}

