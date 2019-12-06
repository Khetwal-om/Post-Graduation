public class ShareResource{
	public static void main(String[] args) {
		B b=new B();
		b.start();

		Thread t=new Thread(b);
		t.start();
		C c=new C();
		c.start();
	}
}

class B extends Thread{
	D d;
	{
		D d=new D();
	}
	D d;
	B (D d){
		this.d=d;
	}

	public void run(){
		d.print(5);
		System.out.println("From  B*");
	}
}

class C extends Thread{
	D d;
	{
		D d=new D();
	}
	C(D d){
		this.d=d;
	}
	public void run(){
		d.print(19);
		System.out.println("From  C*");
	}
}

class D{
	void print(int n){
	
		for(int i=1;i<=n;i++){

		try{
			Thread.sleep(400);
         }
		catch (Exception e){

		}
			System.out.println(n+"  *  "+i+"  =   "+n*i);
		}
	}
}