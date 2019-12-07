import java.io.*;

class AA
{
public static void main(String args[]) throws Exception
{
FileInputStream fis = new FileInputStream("b.txt");
int k=0;
while((k=fis.read())!=-1){
	System.out.println((char)k);
	}
}
}                    