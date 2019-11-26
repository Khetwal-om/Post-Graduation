class Glen
{
	public static void main(String args[])
	{
		James obj_a=new James();
		James obj_b=new James();
		James.j=7;
		System.out.println("As j is static variable so the value of j are same for both the objects");
		System.out.println(obj_a.j+"value of j for obj_a");
		System.out.println(obj_b.j+"value of j for obj_b");

		obj_a.i=2;
		System.out.println("***************************");
		System.out.println(obj_a.i+"Value of instance variable i of obj_a");
		System.out.println("***************************");
		obj_b.j=21;
//		System.out.println(obj_b.i+"value of instance variable i of obj_b");
		System.out.println("The value of j static variable using obj_a object"+obj_a.j);
		System.out.println("The value of j static variable using obj_b object"+obj_b.j);
		System.out.println("The value of j static variable using class name"+James.j);
		
		
	}
}

class James
{
	int i;
	static int j;
}