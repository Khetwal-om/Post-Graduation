1. 

```java

public class ThreadA{
	public static void main(String[] args){
		A a=new A();
		B b=new B();
		a.start();
		b.start();
	}
}

class A extends Thread{
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("A "+i);
			try{
				sleep(2500);
			}
			catch(Exception e){

			}
		}
	}
}

class B extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("B "+i);
			try{
				sleep(2500);
			}
			catch(Exception e){
				
			}
		}
	}
}

```


2. **join** will enable execution and termination of thread before another .

```java
public class ThreadA{
	public static void main(String[] args) throws Exception{
		A a=new A();
		B b=new B();
		a.start();
		a.join();
		b.start();

	}
}

class A extends Thread{
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("A "+i);
			try{
				sleep(2500);
			}
			catch(Exception e){

			}
		}
	}
}

class B extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("B "+i);
			try{
				sleep(2500);
			}
			catch(Exception e){
				
			}
		}
	}
}
```










2. Runnable interface


```java
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
```


3. 