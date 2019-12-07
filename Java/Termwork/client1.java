import java.rmi.*;
public class client1
{
public static void main(String a[]) throws Exception
{
addi obj = (addi)Naming.lookup("ADD");
int n =obj.add(5,4);
System.out.println(n);
}
}