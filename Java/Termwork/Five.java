class Five{
	public static void main(String[] args) {
		
		String first=args[0];
		String second=args[1];

		StringBuffer sbr=new StringBuffer(second);
		sbr.reverse();
		String data=sbr.toString();
		

		if(first.equals(data))
			{
				System.out.println("Yes");
			}
		else
			{
				System.out.println("No");
			}



	}
}