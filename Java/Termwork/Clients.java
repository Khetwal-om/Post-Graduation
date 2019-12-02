import java.io.*;
import java.net.*;


class Clients{
	public static void main(String[] args) throws Exception{
		Socket socket=new Socket("localhost",8080);
		OutputStream outputstream=socket.getOutputStream();
		DataOutputStream dos=new DataOutputStream(outputstream);
		dos.writeUTF("hello");
		outputstream.close();
		socket.close();
	}
}