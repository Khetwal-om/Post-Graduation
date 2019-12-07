
import java.rmi.server.*;

public class ImplementInterface extends UnicastRemoteObject implements RemoteInterface{

	public ImplementInterface() throws Exception{
		super();
	}

	public int add(int x,int y){
		return x+y;
	}
}