import java.io.*;
import java.util.*;
import java.net.*;

class FileToUrl {
	public static void main(String[] args)throws Exception {
		File f=new File("Client.java");
		URL url=f.toURL();
		InputStream is=url.openStream();
		BufferedReader bfr=new BufferedReader(new InputStreamReader(is));
		String s="";
		while((s=bfr.readLine())!=null){
			System.out.println(s);
		}

		bfr.close();
		is.close();
	}
}