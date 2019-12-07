import java.rmi.Remote;


public interface RemoteInterface extends Remote{
	public int add(int a,int b) throws Exception;
}