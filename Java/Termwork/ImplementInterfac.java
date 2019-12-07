import java.rmi.server.*;

public class ImplementInterfac extends UnicastRemoteObject implements CreateInterface{

	public ImplementInterfac() throws Exception
	{	
		super();
	}

	public int add(int x,int y) {
		return x+y;
	}
}