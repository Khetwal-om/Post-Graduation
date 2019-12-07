import java.io.*;
public class B {
	public static void main(String[] args) throws Exception{
		try(
			BufferedReader bfr=new BufferedReader(new FileReader("A.md"));
			)
			{	
				String s="";

				while((s=bfr.readLine())!=null){
					System.out.println(s);
				}
			}

	}
}

class C implements Closeable{
	public void close(){
		System.out.println("Closed");
	}
}