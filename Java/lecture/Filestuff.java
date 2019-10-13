import java.util.Arrays;

public class Filestuff
{
	public static void main(String[] args) 
    {
 		
 		String array[]=args;
 		for (String s : array ) {
 			System.out.print(s+" ");
 		}

 		Arrays.sort(array);
 		for (String s : array ) {
 			System.out.print(s+" ");
 		}
    }
}