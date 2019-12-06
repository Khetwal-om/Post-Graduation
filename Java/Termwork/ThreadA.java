public class ThreadA{
	public static void main(String[] args) throws Exception{
			
		for(int i=0;i<10;i++){
			Thread.sleep(500);
			System.out.println(i);
			}

			B b=new B();
			b.setDaemon(true);
			b.start();
			System.out.println("Exiting from main");
		
	}
}

class B extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(" from B"+i);
			try{
			sleep(1000);

			}
			catch (Exception e){

			}

		}
	}
}




