class A extends Thread
{
	public void run()
	{
		System.out.println("A is started");
		for(int i=0;i<=10;i++)
		{

			System.out.println("From thread  A  "+i);
		}

		System.out.println("Bye from A");
	}
}

class B extends Thread
{


	public void run()
	{
		System.out.println("threadB started");
		for(int i=0;i<=10;i++)
		{
		
			System.out.println("From thread  B  "+i);
		}

		System.out.println("Bye from B");
	}
}



class C extends Thread
{
	public void run()
	{
		System.out.println("threadC started");
		for(int i=0;i<=10;i++)
		{
			System.out.println("From thread C"+i);
		
		}

		System.out.println("Bye from C");
	}
}





public class ThreadTest
{
	public static void main(String[] args) {
		A threadA=new A();
		B threadB=new B();
		C threadC=new C();


		threadC.setPriority(Thread.MAX_PRIORITY);
		threadB.setPriority(threadA.getPriority()+1);

		threadA.setPriority(Thread.MIN_PRIORITY);


		System.out.println(threadA.getPriority());
		System.out.println(threadB.getPriority());
		System.out.println(threadC.getPriority());

		System.out.println("Start thread A");
		threadA.start();


		System.out.println("Start thread B");
		threadB.start();


		System.out.println("Start thread C");
		threadC.start();



		System.out.println("This is the end of main thread");
	}
}


 
