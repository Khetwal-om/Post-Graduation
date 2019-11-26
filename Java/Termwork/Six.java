class Six{
	public static void main(String[] args) {


		String data="123456123456abcdefajkl128";
		String nova="";
		char c=' ';

		for(int i=0;i<data.length();i++){

			 c=data.charAt(i);
			 if(Character.isDigit(c))
			 {
			 	int k=Integer.parseInt(""+c);
			 	if(k%2==0 &&(nova.contains(""+c)==false))
			 	{
			 		nova=nova+c;
			 	}
			 }

		}

		System.out.println(nova);


		
	}
}