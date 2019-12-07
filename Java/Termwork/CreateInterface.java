import java.rmi.*;

public interface CreateInterface extends Remote{
	public int add(int x,int y) throws Exception;
}