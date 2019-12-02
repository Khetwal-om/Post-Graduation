import java.net.*;
import java.io.*;

class Servers{
	public static void main(String[] args) throws Exception{
		ServerSocket serversocket=new ServerSocket(8080);
		Socket socket=serversocket.accept();
		InputStream inputstream=socket.getInputStream();
		DataInputStream datainputstream=new DataInputStream(inputstream);
		String string=datainputstream.readUTF();
		System.out.println(string);
		inputstream.close();
		socket.close();
	}
}