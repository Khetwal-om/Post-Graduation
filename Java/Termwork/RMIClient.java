import java.rmi.*;
public class RMIClient{
	public static void main(String[] args) throws Exception {
		RemoteInterface obj=(RemoteInterface)Naming.lookup("ADD");
		int n=obj.add(1,1);
		System.out.println(n);
	}
}