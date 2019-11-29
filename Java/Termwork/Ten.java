import java.util.*;
class Ten{
	public static void main(String[] args) {
		Thread t=new Thread(new T1());
		t.start();

		new Thread(){
			public void run(){
				print(6);
			}
		}.start();
	}

	synchronized static void print(int n){
		for(int i=0;i<6;i++){
			System.out.println(n+"  *  "+i+"  =  "+n*i);
			try{
				Thread.sleep(500);
			}
			catch (InterruptedException e){
				System.out.println(e);
			}
		}

		System.out.println("Exiting"+Thread.currentThread());

	}
}

class T1 implements Runnable{
	public void run(){
		Ten.print(5);
	}
}