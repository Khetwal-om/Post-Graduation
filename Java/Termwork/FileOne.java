import java.io.*;



class FileOne{
	public static void main(String[] args) throws IOException{
			
			FileReader fr=new FileReader("A.md");

			int k=0;

			while((k=fr.read())!=-1){
				System.out.println((char)k);
			}

			k=0;

			FileWriter fw=new FileWriter("A.md",true);
			fw.write("11122233300000oooooooooooopppppppppppqqqqqqqwwwwwww");
			fw.close();

			while((k=fr.read())!=-1){
				System.out.print((char)k);
			}
			fr.close();

			FileReader frB=new FileReader("A.md");

			System.out.println("  ********************");


			BufferedReader bfr=new BufferedReader(frB);
			String s="";

			while((s=bfr.readLine())!=null){
				System.out.println(s);
			}
			bfr.close();





			BufferedWriter bw=new BufferedWriter(new FileWriter("A.md"));
			bw.write("uiuiuiuiuiuiui");
			bw.newLine();
			bw.write("uiuiuiuiuiuiui");
			bw.newLine();
			bw.write("uiuiuiuiuiuiui");
			bw.newLine();
			bw.write("uiuiuiuiuiuiui");
			bw.close();




	}
}