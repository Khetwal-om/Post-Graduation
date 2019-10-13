public class A{

	public static void main(String[] args)  throws InterruptedException{
	
		B b=new B();
		C c=new C();

		b.start();


		c.start();

	}

}


class B extends Thread
{
	public  void run()
	{
		for (int i=0; i<7 ;++i ) {
			try{
				sleep(100);

			}
			catch (Exception e)
			{
				System.out.println(e);
			}

				System.out.println('b');
		}
	}
}


class C extends Thread
{
	public  void run()
	{
		for (int i=0; i<7 ;++i ) {
			try{
				sleep(30);
			}
			catch (Exception e)
			{
				System.out.println(e);
			}


			
				System.out.println('c');
		}
	}
}


