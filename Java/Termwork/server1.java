import java.rmi.*;
public class server1
{
public static void main(String a[]) throws Exception
{
addc = new addc();
rebind("ADD",obj);
System.out.println("Server started");
}
}