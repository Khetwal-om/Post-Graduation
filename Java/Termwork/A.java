public class A{
	public static void main(String[] args) {

	Thread t=new Thread(){
		public void run(){
			System.out.println(" abc");
		}
	}	;

	t.start();

	t.setName("abc");
	System.out.println(t.getName());
	System.out.println(t.getPriority());
	System.out.println(t.isAlive());

	}
}
