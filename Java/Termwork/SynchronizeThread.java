public class SynchronizeThread{
	public static void main(String[] args) {
		B b=new B();
		b.start();
		C c=new C();
		c.start();
	}
}

class D{
	synchronized static void print(int n){
		for(int i=1;i<10;i++){
			try{
				Thread.sleep(499);
			}
			catch(Exception e){
			}
			System.out.println(n+"  *  "+i+"  =   "+n*i);
		}
	}
}
class B extends Thread{
	public void run(){
		D.print(10);
	}
}
class C extends Thread{
	public void run(){
		D.print(9);
	}
}