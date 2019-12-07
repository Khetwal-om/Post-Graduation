import java.rmi.*;


public class Client{
	public static void main(String[] args)  throws Exception{
		CreateInterface obj=(CreateInterface)Naming.lookup("ADD");

		int n=obj.add(10,20);
		System.out.println(n);
	}
}