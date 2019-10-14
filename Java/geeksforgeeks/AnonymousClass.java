interface Languages
{
	int i=10;
	public abstract void Display();
}



public class AnonymousClass
{	

	public static void main(String[] args) {
		Languages obj=new Languages()
		{
			public void Display()
			{
				System.out.println("Hola ahi"+10);
			}
		};

		
		obj.Display();
	}
}