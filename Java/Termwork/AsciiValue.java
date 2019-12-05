class AsciiValue{
	public static void main(String[] args) {
		int a=0;
		try{
		 	  a=System.in.read();
		}
		catch (Exception e){
			System.out.println();
		}
		System.out.println(a);
		System.out.println((int)a);

	}
}