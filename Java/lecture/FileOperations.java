import java.io.*;

public class FileOperations
{
	public static void main(String[] args) throws IOException {
	
		File f=new File("ui.txt");
		if (f.exists())
		{
			System.out.println("The file is there");
		}
		else
		{

			System.out.println("There is nothing as such");
			System.out.println(f.createNewFile());
			System.out.println("Now is is created");
		}

		FileReader fr=new FileReader(f);
		int k=0;
		String s="";

		int count=0;

		while((k=fr.read())!=-1)
		{
			System.out.println((char)k);
			s=s+""+(char)k;
			count+=1;
		}
		System.out.println(s);

		System.out.println(count);	

		System.out.println("******************************");		
		System.out.println(Math.floor(500/count));
		
		System.out.println("******************************");
		if (count>=500)
		{
			FileWriter fw=new FileWriter(f,true);
			fw.write("om");
			fw.close();
		}
		else if(count<500)
		{
			for(int i=1;i<=Math.floor(500/count);i++)
			{
				FileWriter fww=new FileWriter(f,true);
				fww.write(s);
				fww.close();
			}
		}



	}
}


