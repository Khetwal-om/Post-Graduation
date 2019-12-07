
import java.rmi.Remote;

public interface addi extends Remote
{
 public int add(int x,int y) throws Exception;

}