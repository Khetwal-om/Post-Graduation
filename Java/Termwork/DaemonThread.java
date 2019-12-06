class DaemonThread{
	public static void main(String[] args) throws Exception {
		for(int i=0;i<7;i++){
			Thread.sleep(1200);
			System.out.println("DaemonThread : "+i);
		}

		B b=new B();
		b.setDaemon(true); //Daemon thread
		b.start();
		System.out.println("Exiting from main");
	}
}

class B extends Thread{
	int i=0;
	public void run(){
		while(true){
			try{
				System.out.println("From B");
				sleep(5000);
				i++;
				if(i==3){
					break;
				}
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
}