import java.net.*;
import java.io.*;


class A{
  public static void main(String[] args) throws Exception {
    File f=new File("Client.java");
    URL u=f.toURL();
    InputStream is=u.openStream();
    BufferedReader bfr=new BufferedReader(new InputStreamReader(is));

    while(bfr.readLine()!=null){
    System.out.println(bfr.readLine());
}
	
    // System.out.println( (char)is.read());


  }
}