import java.io.*;
import java.util,*;
class FactClient
{
	public static void main(String s[]) throws Exception
	{
	Socket s=new Socket("localhost"8080);
	OutputStream ou=s.getOutputStream();
	DataOutputStream dot=new DataOutputStream(ou);
	dot.WriteUTF("hello client");
	dot.close(); 
	}