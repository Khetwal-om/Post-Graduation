# File handling


1. Some common methods

```java
import java.io.*;

public class FileOperations
{
	static void print(String s)
	{
		System.out.println(s);
	}

	public static void main(String[] args) throws IOException {
	
		File file=new File("data.txt");
		print(""+file.getName());
		print(""+file.exists());
		print(""+file.getAbsolutePath());
		print(""+file.isDirectory());
		print(""+file.length()+"bytes");

	}
}



data.txt
true
D:\Post Graduation\Java\lecture\data.txt
false
28bytes

```




