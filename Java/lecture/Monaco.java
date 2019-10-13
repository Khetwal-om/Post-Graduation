import java.io.*;

public class Monaco
{
	public static void main(String[] args) {
		File f=new File("D:/");

		File directories[]=null;
		directories=f.listFiles();


		for (File i : directories) {
			System.out.println(i);
		}
	}
}

D:\EL SUENO
D:\ELITE
D:\Genuine