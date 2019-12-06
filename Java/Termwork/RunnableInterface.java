public class RunnableInterface{
	public static void main(String[] args) {
		B obj=new B();
		Thread t1=new Thread(obj);
		t1.start();
	}
}


class B implements Runnable{
	public void run(){
		System.out.println("from B"+Thread.currentThread().getName());
	}
}