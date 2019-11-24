import java.util.Arrays;

class Second{
	public static void main(String[] args) {
		int twoD[][]={{3,4,5},{6},{1,9}};
		int count=0;


		for(int i[]:twoD){
			for(int x:i){
				System.out.println(x);
				count+=1;
			}
		}

		System.out.println("The total number of elements are"+count);

		int oneD[]=new int[count];
		System.out.println(oneD);
		int counter=0;

		for(int one[]:twoD){
			for (int k : one) {
				oneD[counter]=k;
				counter+=1;
			}
		}




		for(int u:oneD){
			System.out.println(u);
		}

		System.out.println("After sorting the arrays");

		Arrays.sort(oneD);

		for(int o:oneD){
			System.out.println(o);
		}



	}
}

