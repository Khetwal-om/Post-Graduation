import java.rmi.server.*;

public class addc  extends UnicastRemoteObject implements addi
{
public addc() throws Exception
{
super();
}
public int add(int x, int y)
{
return x+y;
}

}