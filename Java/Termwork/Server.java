import java.rmi.*;
public class Server{
  public static void main(String[] args) throws Exception{
  	   	
  		ImplementInterfac obj=new ImplementInterfac();
  	   	Naming.rebind("ADD",obj);
  	   	System.out.println("Server ...");
  }
}