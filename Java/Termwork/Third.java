
import java.util.Arrays;
class Third{
	public static void main(String[] args) {
		String s="abcaabccbbabc";
		char array[]=s.toCharArray();
		int count=0;
		int previous=0;
		char least=' ';
		int x=1;

		for (char c : array) {

			for(int i=0;i<array.length;i++){
				if(c==array[i]){
					count+=1;
				}

			}	
			if(x==1){
				previous=count;
				x=0;
			}

			System.out.println(c);
			if(count<=previous){
				least=c;
				previous=count;
			}

			count=0;
		}	
		System.out.println("*^^^^^^^^^^^^^^^^^*");
		System.out.println(least);
		System.out.println("*^^^^^^^^^^^^^^^^^*");

		// char least=' ';
		// char array[]=s.toCharArray();

		// // System.out.println(array);

		// // Arrays.sort(array);
		// // System.out.println(array);
		// int count=0;
		// int previous=0;



		// for (char c : array) {
		// 	System.out.println(c);
		// 	for(int i=0;i<array.length;i++){
		// 		if(c==array[i]){
		// 			count+=1;
		// 		}
		// 		if(count<previous)
		// 		{
		// 			least=c;
		// 		}
		// 	}
		// 		previous=count;
		// 		count=0;


		// }
		// System.out.println("**********");
		// System.out.println(least);




	}
}