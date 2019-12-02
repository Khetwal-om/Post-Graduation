# Revision


1. Client server interaction


 1. Client.java

```java

```


 2. Server.java

```java
class Server{
	public static void main(String[] args) {
		ServerSocket serversocket=new ServerSocket(8080);
		Socket socket=serversocket.accept();
		InputStream inputstream=s.getInputStream();
		DataInputStream datainputstream=new DataInputStream(inputstream);
		String string=datainputstream.readUTF();
		System.out.println(string);
		inputstream.close();
		socket.close();
	}
}
```