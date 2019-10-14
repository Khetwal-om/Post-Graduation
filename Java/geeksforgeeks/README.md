# Static nested class

```java
class Language
{
	static int mbappe=7;
	static private int leo=10;
	int cr=7;

	static class Espanyol
	{
		static void display()
		{
			System.out.println(mbappe);

			System.out.println(leo);
		}
	}
}

public  class Ziych
{
	public static void main(String[] args) {
	  Language.Espanyol obj=new Language.Espanyol();
	  obj.display();	
	}
}
```



# Inner class

*we can use static as well as non-static variables within non-static method but not in static method*
> We will have to access them by **Class** name.

---


```java
class OuterClass
{
	static int mbappe=7;
	static private int leo=10;
	int cr=7;

	 class InnerClass
	{
		 void display()
		{
			System.out.println(mbappe);

			System.out.println(leo);
			System.out.println("ksfjkl");
		}
	}
}

public  class Ziych
{
	public static void main(String[] args) {
	 


	 OuterClass outerObject = new OuterClass(); 
		OuterClass.InnerClass innerObject = outerObject.new InnerClass(); 
		
		innerObject.display(); 
		
	}
}
```

---


# Anonymous class

1. This is the main concept

```java

interface Languages
{
	int i=10;
	public abstract void Display();
}


class Spanish implements Languages
{
	@Override
	public void Display()
	{
		System.out.println("Hola ahi "+10);
	}
}

public class AnonymousClass
{	

	public static void main(String[] args) {
		Spanish obj=new Spanish();
		obj.Display();
	}
}

```

2. This is the way to do the above

```java
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

```

#Serialization

```java

import java.io.*;


public class SerializationConcept
{
	public static void main(String[] args) throws IOException,ClassNotFoundException{

		Check object=new Check("first","second");
		FileOutputStream fobj=new FileOutputStream("data.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fobj);
		oos.writeObject(object);

		oos.close();
		fobj.close();



		Check obj=null;
		FileInputStream file=new FileInputStream("data.txt");
		ObjectInputStream ois=new ObjectInputStream(file);

		
		obj=(Check)ois.readObject();
		System.out.println(obj.a);
		System.out.println(obj.b);

		file.close();
		ois.close();






	}
}


class Check implements Serializable
{
	String a;
	String b;
	public Check(String s1,String s2)
	{
		this.a=s1;
		this.b=s2;
	}

}

```



2. Transient data member can't be saved .

```java
import java.io.*;


public class SerializationConcept
{
	public static void main(String[] args) throws IOException,ClassNotFoundException{

		Check object=new Check("first","second");
		FileOutputStream fobj=new FileOutputStream("data.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fobj);
		oos.writeObject(object);

		oos.close();
		fobj.close();



		Check obj=null;
		FileInputStream file=new FileInputStream("data.txt");
		ObjectInputStream ois=new ObjectInputStream(file);

		
		obj=(Check)ois.readObject();
		System.out.println(obj.a);
		System.out.println(obj.b);

		file.close();
		ois.close();






	}
}


class Check implements Serializable
{
	transient String a;
	String b;
	public Check(String s1,String s2)
	{
		this.a=s1;
		this.b=s2;
	}

}




null
second
```