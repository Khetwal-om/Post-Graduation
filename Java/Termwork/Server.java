import java.net.*;
import java.io.*;



class Server{
	public static void main(String[] args) throws Exception{
		ServerSocket serversocket=new ServerSocket(8080);
		Socket socket=serversocket.accept();
		
		InputStream is=socket.getInputStream();
		DataInputStream dis=new DataInputStream(is);
		String data=dis.readUTF();
		System.out.println(data);
		dis.close();
		socket.close();
	}
}