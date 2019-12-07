import java.rmi.*;


public class RMIServer{
	public static void main(String[] args) throws Exception {
		ImplementInterface =new ImplementInterface();

		rebind("ADD",obj);
		System.out.println("Server Started");
	}
}