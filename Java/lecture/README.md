
# Sep 5

---


1. __Arrays__
  * One dimensional arrays   . The default value of an array type is null.
  * Two dimensional arrays    is collection of 1D arrays {{},{},{}}
  * Three dimensional arrays is collection of 2D arrays {{{}},{{}},{{}}}
  * Four dimensional arrays is collection of 3D arrays {{{{}}},{{{}}}}



```java
class JavaArrays 
{
	public static void main(String[] args) {


		int[][][][]a = {
			{{{1, 2, 3},{4, 5, 6, 9},{7}},{{7,9,10},{11}}},
			{{{5,2},{6,2}},{{1,2}}},
			{{{32,45},{45,45},{93,23}}},
		};

		System.out.println(a[2][0][2][1]);
		System.out.println(a[1][1][0][1]);
	
		for(int[][][] array3D:a)
		{
			for (int[][] array2D:array3D)
			{
				for (int[] array1D:array2D)
				{
					for (int value:array1D)
					{
						System.out.print(value+"  ");
					}
					System.out.println();
				}
			}
			System.out.println();
		}

	}
}



// a[][][][]=
// {
// 	{{{6,7},{23,45}}},
// 	{{{9,8}},{{1,2}}},
// 	{{{12,34,45}}}
// }

// 23
// 2
// 1  2  3
// 4  5  6  9
// 7
// 7  9  10
// 11

// 5  2
// 6  2
// 1  2

// 32  45
// 45  45
// 93  23

```



# Sept 5

1. Array is a collection of similar data type. Arrays are object in java as well as we 
can create array of obejct in java as well. We can declare array locally as well as a part of class.

> We can declare an array as well as initialize it as a variable. \
 There is strict upper bound check in java means if we are having 5 elements we can use only those
  memory locations which are already initialized . \
  We can initialize an  array later on by providing memory using new keyword.\
  int [] array; Leads to faster execution?\
  We can create 2D arrays as 1D arrays\
  
   * 2D arrays are __collection of 1D arrays__ in form of rows and columns.

```java

int a=10;
int array_a={a,a,a,a,a};
int array_b={{a,7,11,13},{a,9,8,7,6},{a},{a,12,7,6,99}}

```

# Sept 6

1. __Variable length arguments__

We can use variable length arguments passed into a method after jdk1.5

```java
 
 void show(int ...x)
 {

 }
 or 
 void show(object ...x)
 {

 }

```

* Consider the following example


```java
class Args
{
  public static void main(String[] args) {
    B b=new B();
    int a[]={7,4,46,344};
    b.show(10,a);
  }
}

class B 
{
  void show(int z,int ...x)
  {
    System.out.println(z);
    System.out.println(x);

    for(int i:x)
    {
      System.out.print(i+"  ");
    }

  }
}


// 10
// [I@368239c8
// 7  4  46  344
```




---

## An object can be final but it's underlying variables can still be changed.


2. Consider the final array. Array is final but still we can change it's elements.


```java
class Args
{
  public static void main(String[] args) {
    B b=new B();
    b.show();
    b.a[3]=999;
    System.out.println("After changing the values-----------------");
    b.show();
  }
}

class B 
{
  final int a[]={12,34,46,65,34};


  void show()
  {
    for(int i:a)
    {
      System.out.println(i);
    }
  }
}


// 12
// 34
// 46
// 65
// 34
// After changing the values-----------------
// 12
// 34
// 46
// 999
// 34 

```


3. We can create array of objects too.

















4. Passing an array to the function

```java
import java.io.*;

class Args
{
  public static void main(String[] args) {
    int a[]={};
    System.out.println(a);
    B obj=new B();
    obj.show(10,20);
  }
}

class B
{
  void show(int ...x)
  {
    System.out.println(x.length);

    for (int i : x) {
      System.out.println(i);
    }
  }
}
```

5. If we are passing an entire array to a function using ... then the array must be the last argument
while calling the function. The following void show() can't be defined as .

```java

void show(int ...x,int z)
{
    //error
}

```

```java

import java.io.*;

class Args
{
  public static void main(String[] args) {

    int array[]={1,2,3,4,5};
    B obj=new B();
    obj.show(7,array);
  }
}

class B
{
  void show(int z,int ...x)
  {

    System.out.println("Z =  "+z);

    for (int i : x) {
      System.out.print(i+"      ");
    }
  }
}

// Z =  7
// 1      2      3      4      5
```


6. The arguments passed during command line can be final

```java


class Args
{
  public static void main(final String ...args) {

    System.out.println("Arguments passed");
    System.out.println("--------");
    System.out.println(args);


  }
}



```

7. Final obj can't be assigned new memory location

```java

class Args
{
  public static void main(final String ...args) {

    final B obj=new B();
    obj=new B();


  }
}

class B
{
  final int i=3;
}
```


8. Even if the array is Final it too can't be assigned new memory

```java

class Args
{
  public static void main(final String ...args) {

    B obj=new B();


    obj.a=new int[4];


  }
}

class B
{
  final int a[]={1,2,3,4,5,6,8};
}
```


9. Even though the array is declared final we can still update it's values

```java


class Args
{
  public static void main(final String ...args) {


    B obj=new B();


      for (int i : obj.a) {
      System.out.print(i+"   ");
    }


    System.out.println("Before-------------------");

    System.out.println("After------------------------");
    obj.a[3]=7;
    for (int i : obj.a) {
      System.out.print(i+"   ");
    }

  }
}

class B
{
  final int a[]={1,2,3,4,5,6,8};
}







// 1   2   3   4   5   6   8   Before-------------------
// After------------------------
// 1   2   3   7   5   6   8


```

10. The default values assigned to an array elements are null.

```java


class Args
{
  public static void main(final String ...args) {


    B b=new B();
    B c=new B();

    B array[]=new B[2];
    System.out.println(array[0]);

    System.out.println(array[1]);


  }
}

class B
{

}





```


12. 

```java


class Args
{
  public static void main(final String ...args) {


    B b=new B();
    B c=new B();

    B array[]=new B[2];

    array[0]=b;
    array[1]=c;

    System.out.println(array[0]);

    System.out.println(array[1]);
  }
}

class B
{

}



B@4aa8f0b4
B@9e89d68



```














. Overriding the toString method of String  class.


```java
class Args
{
  public static void main(String[] args) {
    

    char array[]={'a','b','c','d','e','f'};
    String1 obj=new String1(array);
    System.out.println(obj);
}
}


class String1
{
  String1(char f[])
  {

  }

  public String toString()
  {
    return "yie";
  }
}
```


# sept 7

1. We can initialize a string object by some string literal constant also.
   String s="abc"

   * We can use several method of string to manipulate string object

```java


String s="vale";
char c=s.charAt(0);  //v
int length_s=s.length()

```



2. Comparision of two string objects can be done in the following ways-

> ==     always checks reference and returns boolean value  \
> equals() checks reference when the equals() method belongs to  object class but it checks values
of two string objects when equals() method belong to String class \
e> compareTo() returns 0 when if two values are identical otherwise first non-matching character
ascii difference. __If one string is subset of another length difference is returned__ .


```java
class A
{
  public static void main(String[] args) {
    String s1="accd";
    String s2="acc";

    System.out.println("This is ==      :      "+(s1==s2));  //false
    System.out.println("Equals method   :   "+s1.equals(s2)); //false
    System.out.println("Compareto method:   "+s1.compareTo(s2)); // 1
  }
}




class A
{
  public static void main(String[] args) {
    String s1="acc";
    String s2="acc";

    System.out.println("This is ==      :      "+(s1==s2));//true
    System.out.println("Equals method   :   "+s1.equals(s2));//true
    System.out.println("Compareto method:   "+s1.compareTo(s2));//0
  }
}

```

* Check the difference

If we are initialising a string by some string literal constant as

```java
String s1="abc";
String s2="abc"; 
```
   * Both refer to the same thing.
   * In this case memory to abc will be allocated by __JVM__ in separate __area of heap String constant pool__.



```java

class A
{
  public static void main(String[] args) {
    String s1="acc";
    String s2="acc";

    System.out.println("This is ==      :      "+(s1==s2));   //true
    System.out.println("Equals method   :   "+s1.equals(s2));//true
    System.out.println("Compareto method:   "+s1.compareTo(s2));//0
  }
}

```

   * But when memory is assigned with 
help of new keyword ,a new memory location is created always which unequivocably different from String s="hola".


```java

class A
{
  public static void main(String[] args) {
    String s1=new String("acc");
    String s2=new String("acc");

    System.out.println("This is ==      :      "+(s1==s2));   //false
    System.out.println("Equals method   :   "+s1.equals(s2));//true
    System.out.println("Compareto method:   "+s1.compareTo(s2));//0
  }
}
  
```











# sept 12 

---

GitHub supports emoji! :+1: :sparkles: :camel: :tada: :rocket: :metal: :octocat: 


1. __Wrapper Class__ : We can convert one type to another by the help of *Wrapper Class* . Each *primitive 
data type* corresponds to a *Wrapper class*. 

Primitive data type | Wrapper class
 ------------ | ------------
 bytes 8  | Byte
 short 16 | Short
 int   32 | Integer
 long 64  | Long
 float 32 | Float
 double 64| Double
 char 16  | Character
 boolean 1| Boolean

   * We can use these classes to convert one type to another. We can convert primitive integer into corresponding object by the help of *Integer* wrapper class.

2. __Boxing__   :octocat:  Boxing is converting primitive data type to object.

```java
int i=7;
Integer iobj=new Integer(i);        //Boxing

```
> The object can further be converted to string  using, further we can reverse it using StringBuffer.

```java
String s=iobj.toString();
```
\

 Before JDK 1.5 we can't convert wrapper class object directly as 
```java
Integer i=new Integer(5);
int x=i.intValue();
```
\

This is to mention the use of parseInt as well as StringBuffer
```java
class A
{
	public static void main(String[] args) {



		Integer tag=new Integer(4);
		int k=tag.intValue();              //unboxing
		System.out.println(k*10);


		int initialvalue=123456789;
		Integer valueobj=new Integer(initialvalue);

		String s=valueobj.toString();
		System.out.println(s);
		StringBuffer obj=new StringBuffer(s);
		obj.reverse();
		System.out.println("This is the value of StringBuffer object :"+obj);
		System.out.println("This is the value of s                   :"+s);

		String m=obj.toString();
		System.out.println(m);
		int ui=Integer.parseInt(m);	
		System.out.println(ui-1);
	}
}
```


3. **Unboxing** : is converting object to a primitive data type.

> wrapperclassobj.datatypeValue();

```java
		Integer tag=new Integer(4);
		int k=tag.intValue();
		System.out.println(k*10);
```


4. **Autoboxing** and **Autounboxing** : In autoboxing we can assign a primitive directly to object and vice versa for the latter.

```java
	Integer i=new Integer(5);  //boxing
	Integer i=7;               // auto boxing

	int k=i;    			   // auto unboxing
	int k=i.intValue();        // unboxing         

```

5. We can use wrapper class object to call its method. Wrapper class may contain some static methods.

```java

Integer i=7;   // Auto boxing
String s=Integer.toString(7);

```

```java
class A
{
	public static void main(String[] args) {
		Integer value=7654;  //autoboxing
		System.out.println(value*100);


		//  Each wrapper class have a static method toString().

		String s=value.toString();
		System.out.println(s);
		StringBuffer sobj=new StringBuffer(s);
		sobj.reverse();

		String m=sobj.toString();
		System.out.println("This is the string m"+m);
		value=Integer.parseInt(m);
		System.out.println(value*100);


			Integer I=7;
		String answer=I.toString();
		// String ui=Integer.valueOf(I);
		System.out.println(answer);
		System.out.println("");

		String binary=Integer.toBinaryString(7);
		System.out.println(binary);
	
	


	}
}


```

6. Character wrapper class functions

```java
class A
{
	public static void main(String[] args) {


    	Character grade='u';
  	   System.out.println(Character.isDigit(grade));
  	   System.out.println(Character.isLetter(grade));


  	   Character c='*';
  	   System.out.println(Character.isDigit(c));
  	   System.out.println(Character.isLetter(c));

  	   if (Character.isLowerCase(grade))
  	   {
  	   	System.out.println("yeah");
  	   }
  	   else
  	   {
  	   	System.out.println("nope");
  	   }
  	   System.out.println(Character.toUpperCase(grade));
  	   String m="kajdfsk";
  	   System.out.println(m.toUpperCase());

  	   StringBuffer obj=new StringBuffer("Check this one OUT");  // Convert this to uppercase ?

	}
}


```

> **This output is weird** 

```java

class A
{
	public static void main(String[] args) {

		Character grade='A';
		char c='A';
		System.out.println(grade+c);      // 130
		System.out.println(c);				// A
		System.out.println(grade);			// A

	}
}


```

Guess the output\

```java
class A
{
	public static void main(String[] args) {

		Character grade='A';
		char c='A';
		System.out.println(grade+c);      // 130
		System.out.println(c);				// A
		System.out.println(grade);			// A

		String result="";
		result+=c;
		System.out.println(result);
		result+=grade;
		System.out.println(result);

	}
}


```
:camel:      :tada:       :metal:

> If we want to print the values as it is use "" **prior** to adding (c+d) otherwise ready for addition
of the characters ascii value.

```java
class A
{
	public static void main(String[] args) {


			char c='A';
			char d='B';
			System.out.println(c+d);
			System.out.println(" "+c+d);

	}
}

```

This is the another one \

```java

class A
{
	public static void main(String[] args) {


			char c='1';
			char d='1';
			System.out.println(c+d);          //98
			System.out.println(" "+c+d);      //11

	}
}


```
This one is __weird__

```java

			char ui='(';          //'*','$'
			int uk=Character.getNumericValue(ui);
			System.out.println(uk);   // -1

```


7. char cannot be __dereferenced__         :rocket:

```java
class A
{
	public static void main(String[] args) {

		Character grade='u';


		String s=grade.toString();
		System.out.println(s);

		char c='i';
		String m=c.toString();         //char cannot be dereferenced
		System.out.println(m);

	}
}

```

---





:camel:      :rocket:    :+1:       :+2:    :tada: 

:sparkles:


---


# 14 September

---

1. Boxing converts a primitive data type to an object. __autoboxing__ do this by
   default.
   > The Vector class in java work internally as array of objects.\
     It have various methods to perform various operations.\
      size() method tells the size of vector\
      addElement(argument)  adds element at end in the vector\
      add(argument) also adds element to vector.
      
     


```java
import java.util.*;


public class A
{
	public static void main(String args[])
	{
		Integer i=9;  //autoboxing
		Double d=11.9;
		String s="icardi";

		Vector v=new Vector();
		v.addElement(i);
		v.addElement(d);
		v.addElement(s);
		System.out.println(v);
	}
}

//D:\GEU\Semester_fifth\core-java-concepts>javac A.java
//	
//
//		D:\GEU\Semester_fifth\core-java-concepts>java A
//		[9, 11.9, icardi]

```


---



2. Fix the given error


	Note: A.java uses unchecked or unsafe operations.
	Note: Recompile with -Xlint:unchecked for details.
	
	
3. HashSet performs similar to Vector but it never store objects with same reference
 or same values aren't stored in __HashSet__.
 
 > add() appends an element at the end.\
   addElement() doesn't works here?
    
    
4. We can't add two objects of Object class or any other class. Inorder to perform
 a mathematical operation on integer or double we must __downcast them__.
 
 ```java

import java.util.*;
        
        
        public class A
        {
        	public static void main(String args[])
        	{
        
        		B obj=new B();
        		Object o=obj.show(7);
        
        		System.out.println(o+o);
        
        	}
        }
        
        
        class B
        {
        	Object show(Integer i)
        	{
        			return i;
        	}
        
        }
        
        
        A.java:12: error: bad operand types for binary operator '+'
        		System.out.println(o+o);
        		^
        		first type:  Object
        		second type: Object
        		1 error
```


> On resolving above by downcasting.


1. __Approach One__

```java

import java.util.*;


public class A
{
	public static void main(String args[])
	{

		B obj=new B();
		Integer o=obj.show(7);

		System.out.println(o+o);



	}
}


class B
{
	Integer show(Integer i)
	{
			return i;
	}

}




```


2. __Approach two__


```java

```


5. The given array of objects perform same as Vector class object. This 
implies that internally vector class uses object array.

 > Since memory was assigned with help of new keyword , the compiler always
   initialize the objects with null values.

```java

import java.util.*;


public class A
{
	public static void main(String args[])
	{

		B obj=new B();
		obj.add("a");
		obj.add("b");
		obj.add("c");
		obj.display();



	}
}


class B
{
	static int m=0;

	Object o[]=new Object[10];

	void add(Object i)
	{
		o[m++]=i;
	}

	void display()
	{
		// Since o is an array , we can iterate over it
		for (int i=0;i<o.length;i++)
		{
			System.out.println(o[i]);
		}
	}
}


	a  
	b
    c
		null
		null
		null
		null
		null
		null
		null



```

* We can now say that internally array of object is stored as we are able to 
  store Integer,Double,String in a single array.

```java
import java.util.*;


public class A
{
	public static void main(String args[])
	{

		B obj=new B();
		obj.add("a");
		obj.add(3.34);
		obj.add(4);
		obj.display();



	}
}


class B
{
	static int m=0;

	Object o[]=new Object[10];

	void add(Object i)
	{
		o[m++]=i;
	}

	void display()
	{
		// Since o is an array , we can iterate over it
		for (int i=0;i<o.length;i++)
		{
			System.out.println(o[i]);
		}
	}
}




D:\GEU\Semester_fifth\core-java-concepts>java A
		a
		3.34
		4
		null
		null
		null
		null
		null
		null
		null

		D:\GEU
		
		
```


#Questions fix me

```java
import java.util.*;


public class A
{
	public static void main(String args[])
	{


		String a="abc332k23";
		String answer[]=new String[10];

		int len=a.length();

		while(len!=0)
		{
			if (c.isDigit())
			{
				Character c = Character.parseInt(a(len));
				System.out.println(c);
			}

			len--;
		}


	}
}








//import java.util.*;
//
//
//public class A
//{
//	public static void main(String args[])
//	{
//
//		B obj=new B();
//		obj.add("a");
//		obj.add(3.34);
//		obj.add(4);
//		obj.display();
//
//
//
//	}
//}
//
//
//class B
//{
//	static int m=0;
//
//	Object o[]=new Object[10];
//
//	void add(Object i)
//	{
//		o[m++]=i;
//	}
//
//	Object addElementsAt(int i)
//	{
//
//	}
//
//	void display()
//	{
//		// Since o is an array , we can iterate over it
//		for (int i=0;i<o.length;i++)
//		{
//			System.out.println(o[i]);
//		}
//	}
//}
//
//
//
//

```


# Sept 16


---

1. Create a one dimensional String array of size 3 from args CLI.

```java

class A
{
    public static void main(String[] args) {

        String answer[]=args;

        String another[]=new String[3];

        System.out.println("This is the length of another"+another.length);
        another=args;
        System.out.println("This is the length of another"+another.length);

        for (String s:answer) {
            System.out.print("  "+s);
        }

        for (String s: another) {
            System.out.print("  "+s);
        }

        System.out.println("***************************");

        for (int i = 0; i < another.length; i++) {
            System.out.print("  "+another[i]);
        }

        System.out.println("Finally   "+another.length);

    }
}


java A james hola extrems unil idn
        ot want somebody like you i only want you
        This is the length of another3
        This is the length of another13
        james  hola  extrems  unil  idnot  want  somebody  like  you  i  only  want  you  james  hola  extrems  unil  idnot
        want  somebody  like  you  i  only  want  you***************************
        james  hola  extrems  unil  idnot  want  somebody  like  you  i  only  want  youFinally   13



```



2. Store numeric value of given string into another string . No duplicates should be there.

```java

class A
{
    public static void main(String[] args) {


       String s="abc345kjs34587091383fdk9876345";
       int len=s.length();
       System.out.println(len);
       String answer="";

       int k=0;

       while(k<len)
       {
           if(Character.isDigit(s.charAt(k)))
           {
               char c=s.charAt(k);
               if (answer.contains(""+c))     // (answer.contains(c)) char cannot be converted to CharSequence
               {
                   k++;
                   continue;
               }
               else
               {

                   answer+=s.charAt(k);
                   k++;
               }


           }
           k++;
       }


       System.out.println(answer);

    }
}




```

3. StringBuffer create references

```java

class A
{
    public static void main(String[] args) {

        String as=args[0];

        StringBuffer obj=new StringBuffer(as);
        obj.reverse();
        System.out.println(obj.toString());
    
    }
}




```

#### I said perfect answer   :)

```java
class A
{
    public static void main(String[] args) {

        System.out.println(new StringBuffer(args[0]).reverse());

    }
}


```



4. __StringBuffer__

>StringBuffer is a sequences of character but mutable in nature, i.e., we can change value
of a StringBuffer obj dynamically after creation.\
We can create StringBuffer by the help its constructor by passing string.

---


5. String and StringBuffer

```java

class A
{
    public static void main(String[] args) {

        String s="yipieeeeeeeeeeeeee";
        s.concat("holaa");
        System.out.println(s.concat("hoiiiiiiiiiiiiiiiiiiii"));


        // Convert String to StringBuffer object and vice versa

        StringBuffer obj=new StringBuffer(s);
        String answer="";
        obj.reverse();
        answer=obj.toString();

        System.out.println(answer);


        // initialize 1D string array of size from CLI

        String wow[]=args;
        System.out.println("*****************");

        for (String a: wow) {
            System.out.print(" "+a);
        }

        System.out.println("*****************");

        String again[]=new String[5];
        again=args;
        for (String o: again) {
            System.out.print("  "+o);
        }


        System.out.println("*****************");


    }
}





```



6. __StringBuffer__ is mutable i.e., its value can be changed while String never changes.
StringBuffer creates a reference. In String every time new memory is assigned.
  We can join two strings using __+__ or __concat__ .
  In case of StringBuffer we can append a string to it. No new memory is created .


```java

class A
{
    public static void main(String[] args) {

        String s1=new String("abc");
        String s2=new String("abc");




        System.out.println("Using equals methods:"+s1.equals(s2));
        System.out.println("Using  double ==   : "+(s1==s2));
        System.out.println("*****************************");


        String t1="boss";
        String t2="boss";

        System.out.println("*****************************");

        System.out.println("Using equals methods:"+t1.equals(t2));
        System.out.println("oUsing  double ==   : "+(t1==t2));



        StringBuffer obj_a=new StringBuffer("hola");

        StringBuffer obj_b=new StringBuffer("hola");

        System.out.println("*****************************");

        System.out.println("Using equals methods:"+obj_a.equals(obj_b));
        System.out.println("oUsing  double ==   : "+(obj_a==obj_b));


        System.out.println("obj_a and obj_b are objects inorder to compare their values convert them to String");

        obj_a.reverse();
        obj_b.reverse();
        String sobj_a=obj_a.toString();
        String sobj_b=obj_b.toString();


        System.out.println(sobj_a);
        System.out.println(sobj_b);

        System.out.println("*****************************");
        System.out.println("Using equals methods:"+sobj_a.equals(sobj_b));
        System.out.println("oUsing  double ==   : "+(sobj_a==sobj_b));





    }
}







```






7.  A minute difference

```java
class A
{
    public static void main(String[] args) {
        B obj_a=new B("hola");
        B obj_b=new B("hola");
        System.out.println(obj_a.equals(obj_b));  // equals of Object class is called rather than of String class
        System.out.println("******************");
        System.out.println(obj_a==obj_b);   // this always checks the reference

    }
}

class B
{
    B(String x)
    {

    }
}









```


8. __reverse__ a string

```java

class A
{
    public static void main(String[] args) {

        B obj=new B();

        System.out.println(obj.reverse("malayalam"));
    }
}



class B
{

    String reverse(String m)
    {
        String answer="";
        int len=m.length()-1;
        while(len>=0)
        {
            System.out.println(len);
            answer+=m.charAt(len);
            len--;
        }
        return answer;
    }

}





```

9. Fix the error

```java
class A
{
    public static void main(String[] args) {

        String reverse(String "hi")
        {
            String answer="";
            int len=m.length()-1;
            while(len>=0)
            {
                System.out.println(len);
                answer+=m.charAt(len);
                len--;
            }
            return answer;
        }

    }
}



```


10. Addition of numeric values from a string

```java
class A
{
    public static void main(String[] args) {

        StringBuffer stringBuffer=new StringBuffer("Object 12345Oriented OOPs");
        int sum=0;
        String obviate="";
        System.out.println("The string is"+stringBuffer+" Its length is  "+stringBuffer.length());
        String answer="";

        for (int i = 0; i < stringBuffer.length(); i++) {
            if(Character.isDigit(stringBuffer.charAt(i)))
            {
                answer+=stringBuffer.charAt(i);
                obviate=""+stringBuffer.charAt(i);
                int k=Integer.parseInt(obviate);
                sum+=k;

            }
        }

        System.out.println(answer);
        System.out.println(sum);
    }
}
```

11. Vector

```java

import java.util.*;

class A
{
    public static void main(String[] args) {
        Vector list=new Vector();
        int len=args.length;

        for (int i = 0; i < len; i++) {
            list.addElement(args[i]);
        }

        System.out.println(list);


        list.insertElementAt("MERN",2);
        int size=list.size();





        String listArray[]=new String[size];
        list.copyInto(listArray);         // Copies all elements of list into Array

        for (String a:listArray) {
            System.out.println(a);
        }
    }
}


```


---

# Wrapper classes


1. Creating Object of primitive data type and vice-versa

---
   
   *  __Converting primitive to object__


```java

           Integer integer=new Integer(7);
           Float afloat=new Float(3.4F);
           Double adouble=new Double(43.43);
           Long along=new Long(2333433432323343l);
   
   
           System.out.println(integer);
           System.out.println(adouble);
           System.out.println(afloat);
           System.out.println(along);

```   
   * __Converting object to primitive__
    
```java

        // Converting to object

        int i=integer.intValue();
        float pi=afloat.floatValue();
        long lo=along.longValue();
        double big=adouble.doubleValue();


        System.out.println(i);
        System.out.println(pi);
        System.out.println(lo);
        System.out.println(big);

```


---

  * __Converting primitive to string using  toString()__
  
```java


        
        a=Integer.toString(i);
        b=Float.toString(pi);
        c=Long.toString(lo);
        d=Double.toString(big);

```
  
  * Converting string objects to primitive values using __static method valueof()__
  
```java
       intvalue=Integer.valueof(str)
       floatvalue=Float.valueof(str)
```
---


  *  __Converting Numeric Strings to primitive data types using parsing methods__

  
```java

        // Converting Numeric Strings to primitive data types using parsing methods
        
        String str="12";
        int ii=Integer.parseInt(str);
        long jj=Long.parseLong(str);

        System.out.println("********************");
        System.out.println(ii);
        System.out.println(jj);

```

```java

import java.util.*;

class A
{
    public static void main(String[] args) {

        // Converting primitive to object

        Integer integer=new Integer(7);
        Float afloat=new Float(3.4F);
        Double adouble=new Double(43.43);
        Long along=new Long(2333433432323343l);


        System.out.println(integer);
        System.out.println(adouble);
        System.out.println(afloat);
        System.out.println(along);


        // Converting to object

        int i=integer.intValue();
        float pi=afloat.floatValue();
        long lo=along.longValue();
        double big=adouble.doubleValue();


        System.out.println(i);
        System.out.println(pi);
        System.out.println(lo);
        System.out.println(big);

        String a=Integer.toString(i);
        String b=Float.toString(pi);
        String c=Long.toString(lo);
        String d=Double.toString(big);



        int primitiveIntFromString=Integer.valueOf(a);
        System.out.println("********************");
        System.out.println(primitiveIntFromString);
        
        
        
        // Converting Numeric Strings to primitive data types using parsing methods
        
        String str="12";
        int ii=Integer.parseInt(str);
        long jj=Long.parseLong(str);

        System.out.println("********************");
        System.out.println(ii);
        System.out.println(jj);

    }
}

```




---





# sept 18  :+3:

---
1. A package is a separation of classes

 by convention all package name must be small. If we are not creating user defined package in that case
 all the classes will be part of default package representing current :+4: ?.

 > One **class can use another class of same package** with any import statement.\
 We can create our own package by using package creation as package followed by __package name__.\
 :+8: Package creation should be the first statement of java program as package followed by package name.\
 The package creation statement is placed even before import statement.\
 We can create a package folder by the help of conditional compilation.\
 A package can have n number of of classes. A class in same compilation unit can use another class. :+2:
 

---


# sept 19 :rocket:

---

1. We can place number of classes within a package and one class can access another class directly without
any import . In order to use one package class by another package class we have to import a class successfully. __default means accesssible only within package__. :+1: 

2. If class is public its method are not by default public and we know the meaning of default is only accessible within package.

  Access specifier | public | protected | default | private 
  ------------ | ------------ | ------------ | ------------ | ------------
 |same class same package|yes|yes|yes|yes|
 |diff class same package|yes|yes|yes|no|
 |subclass same package|yes|yes|yes|no|
 |diff class diff package|:+1:|:+1:|:+1:|:+1:|
 |sub class diff package|:+1:|:+1:|:+1:|:+1:|
 ||||||||



1. __same class same package__

 ```java

 class A
{
	public static void main(String[] args) {
		zero();
		first();
		second();
		third();
		}

		static void zero()
		{
			System.out.println("within default method  |same class | same package");
		}
		public static void first()
		{
			System.out.println("within public method first  |same class | same package|");
		}
		protected  static void second()
		{
			System.out.println("within protected method second |same class |same packge");
		}
		private static  void third()
		{
			System.out.println("within private method third |same class |same package");
		}

	
}



within default method  |same class | same package
within public method first  |same class | same package|
within protected method second |same class |same packge
within private method third |same class |same package

```

2. different class same package

 	
	*this is with an error, :-1: error because private method is not accessible within different class
	even if the package is same*

```java
class A
{
	public static void main(String[] args) {
		
		B obj=new B();

		obj.zero();
		obj.first();
		obj.second();
		obj.third();
	
}

}

class B
{

		static void zero()
		{
			System.out.println("within default method  |same class | same package");
		}
		public static void first()
		{
			System.out.println("within public method first  |same class | same package|");
		}
		protected  static void second()
		{
			System.out.println("within protected method second |same class |same packge");
		}
		private static  void third()
		{
			System.out.println("within private method third |same class |same package");
		}

}


// A.java:10: error: third() has private access in B
//                 obj.third();
//                    ^
// 1 error

```

	* this is without an error :+1: , Here rest three public,protected,default are available.*


```java
class A
{
	public static void main(String[] args) {
		
		B obj=new B();

		obj.zero();
		obj.first();
		obj.second();
	
	
}

}

class B
{

		static void zero()
		{
			System.out.println("within default method  |different | same package");
		}
		public static void first()
		{
			System.out.println("within public method first  |different class | same package|");
		}
		protected  static void second()
		{
			System.out.println("within protected method second |different class |same package");
		}
		

}


D:\GEU\Semester_fifth\core-java-concepts\lecture>java A
within default method  |different class | same package
within public method first  |different class | same package|
within protected method second |different class |same package
```



3. subclass same package

 **private method is not available for the subclass**

```java
class A
{
	public static void main(String[] args) {
		
	
	C obj=new C();
}

}

class B 
{

		static void zero()
		{
			System.out.println("within default method  |sub class | same package");
		}
		public static void first()
		{
			System.out.println("within public method first  |sub class | same package|");
		}
		protected  static void second()
		{
			System.out.println("within protected method second |sub class |same packge");
		}
		private static void third()
		{
			System.out.println("within private method third | sub class |same package");
		}
		

}
class C extends B
{
	{
		zero();
		first();
		second();
		third();
	}
}



A.java:39: error: cannot find symbol
                third();
                ^
  symbol:   method third()
  location: class C
1 error

```
  **This is valid**

```java
class A
{
	public static void main(String[] args) {
		
	
	C obj=new C();
}

}

class B 
{

		static void zero()
		{
			System.out.println("within default method  |sub class | same package");
		}
		public static void first()
		{
			System.out.println("within public method first  |sub class | same package|");
		}
		protected  static void second()
		{
			System.out.println("within protected method second |sub class |same packge");
		}

		

}
class C extends B
{
	{
		zero();
		first();
		second();

	}
}



within default method  |sub class | same package
within public method first  |sub class | same package|
within protected method second |sub class |same packge

```

4. Different class different package

  *class English within package languageA*

```java

package languageA;

public class English
{
	public static void main(String[] args) {


	}

		static void zero()
		{
			System.out.println("within default method  |different class | different package");
		}
		public static void first()
		{
			System.out.println("within public method first  |different class | different package|");
		}
		protected  static void second()
		{
			System.out.println("within protected method second |different class |different packge");
		}
		private static void third()
		{
			System.out.println("within private method third  | different class | different package");
		}

}



```
	


5. **subclass different package**


	* class Spanish within package languageB*

> In different class diffferent package only public method is available.

```java
package languageB;
import languageA.*;
public class Spanish
{
	public static void main(String[] args) {
		English obj=new English();

		obj.zero();
		obj.first();
		obj.second();
		obj.third();
	}
}



Spanish.java:8: error: zero() is not public in English; cannot be accessed from outside package
                obj.zero();
                   ^
Spanish.java:10: error: second() has protected access in English
                obj.second();
                   ^
Spanish.java:11: error: third() has private access in English
                obj.third();
                   ^
3 errors

```

	*If we extend English in spanish then public and protected methods are accessible*

```java
package languageB;
import languageA.*;
public class Spanish extends English
{
	public static void main(String[] args) {
		English obj=new English();

		obj.zero();
		obj.first();
		obj.second();
		obj.third();
	}
}





Spanish.java:8: error: zero() is not public in English; cannot be accessed from outside package
                obj.zero();
                   ^
Spanish.java:11: error: third() has private access in English
                obj.third();
                   ^
2 errors
```


---

















# Sept 19

---


####Conversion


1. Boxing : converting primitive data type to an object

```java

class D
{
	public static void main(String[] args) {
		int value=10;  // primitive data type
		Integer valueobj=new Integer(value);

		System.out.println("Primitive               one :"+value);
		System.out.println("Objec of primitive datatype :"+valueobj);


		System.out.println("Operation of primitive      :"+value*10);
		System.out.println("Object of primitive         :"+valueobj*100);

			
	}
}

Primitive               one :10
Objec of primitive datatype :10
Operation of primitive      :100
Object of primitive         :1000



class D
{
	public static void main(String[] args) {
		int value=10;  // primitive data type
		Integer valueobj=new Integer(value);

		System.out.println("Primitive               one :"+value);
		System.out.println("Objec of primitive datatype :"+valueobj);


		System.out.println("Operation of primitive      :"+value*10);
		System.out.println("Object of primitive         :"+valueobj*100);


		int answer=valueobj.intValue();
		System.out.println("Retrieved integer primitive value from object        :"+answer);

		Double pi=new Double(3.14);
		double pie=pi.doubleValue();  
		System.out.println(pie*10);
				// Double pi=3.14;
		// double pie=pi.doubleValue();

			
	}
}




```

2. Converting object to primitive datatype

```java



```

---









# sept 20     :+1:     Exception Handling

---

1. __Exception Handling__: Exceptions are abnormal conditions arising in a code segment at run time.
    There may be two type of errors 
    > Compile time \
      Run time

* Compile time errors are like missing semicolons and can't be handled.
* Runtime errors are called exceptions and can be handled by using mechanism like try,catch,throw,finally and throws.
* Exception should be handled and can be handled only once.
* Handling of exception means we are telling user the cause and place of exception. Exception may occur
it is not suer it will.
* There are certain predefined exceptions for specific conditions like __Arithmetic__,__ArrayIndexOutOfBounds__.

* **All exceptions are in the form of Object**.

 *Throwable*

Error | Exception
 ------------ | ------------
   |   Runtime
 IOException,FileNotFound |   Arithmetic,ArrayIndexOutOfBounds,NullPointer 

 NumberFormatException


* We can handle exception explicitly by the help of try and catch. We have to put lesser code in try
that may generate an exception.

* **Java is robust because of Strong exception handling concepts**.

* try can be used in the following ways:

1. The first one

```java

try
{

}
catch(Exception e)
{

}

```

2. Second one

```java
try
{

}
catch (ExceptionType1 e1)
{

}
catch( ExceptionType2 e2)
{

}
```

3. Third 

```java

try
{

}
catch(Exception e)
{

}
finally
{}
```

4. Fourth

```java

try
{

}
catch (RuntimeException e)
{

}
catch()
{

}
....
catch(Exception e)
{

}
finally
{

}
```

5. Fifth one :sparkles:

```java

```

---



2. We can nest one try within another . The outer try can use outer  catch but **outer try can't use
inner catch.**

```java

class A
{
	public static void main(String[] args) {
		
		System.out.println("1");
		try{
			System.out.println("2");
			try
			{
				System.out.println(5/0);
			}
			catch(NullPointerException obj)
			{
				System.out.println(obj);
			}
			System.out.println("3");
		}
		catch(Exception obj)
		{
			System.out.println(obj);
		}
		System.out.println("5");

	}
}

// 1
// 2
// java.lang.ArithmeticException: / by zero
// 5

```



3. We can use finally block **with a try or with try catch** . 

> **Finally block never handle exception.** It is a block which is always executed . \
  Exception occurs or not it doesn't matter for finally to get executed.






# sept 21 

---

1. We can use a finally block without __catch__

> Finally never handles an exception

__Syntax__

```java

try{

}
finally
{

}
```
  \
  If there is no catch __finally is called by JVM before control is passed to try__

  :sparkles: ?          ?  Fix this issue.

```java

class A
{
	public static void main(String[] args) {
		
		System.out.println("first");
		try
		{
			System.out.println("I am within try"+5/0);
		}

		finally
		{
			System.out.println("Within finally");
		}

		System.out.println("Last");
	}
}

// first
// Within finally
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at A.main(A.java:9)

```


---



# sept 23


---

1. :rocket:  We can create our own exception and it can be thrown on some user condition. 
	
 > We can throw only those instances whcih are of type throwable.\
 We can throw an exception by the help of throw keyword.\

```java
class A
{
	public static void main(String[] args) {
		
		B b=new B();
		b.calculate(11000,10);
		b.calculate(1000,20);

// 		110000
// Exception in thread "main" java.lang.RuntimeException: RuntimeException obj
//         at B.calculate(A.java:16)
//         at A.main(A.java:7)
		
	}
}

class B
{
	void calculate(int basic,int days)
	{
		RuntimeException obj=new RuntimeException("RuntimeException obj ");
		if(basic>=10000)
			System.out.println(basic*days);
		else
			throw obj;       // explicit
	}
}
```
The exception thrown can be checked or unchecked.\
If we are not able to handle exception under category checked using try block we have to use throws keyword.


2. Invalid 

```java

class A
{
	public static void main(String[] args) {
		
		B b=new B();
		b.calculate(11000,10);
		b.calculate(1000,20);

	}
}

class B
{
	void calculate(int basic,int days)
	{
		Exception obj=new Exception("RuntimeException obj ");
		if(basic>=10000)
			System.out.println(basic*days);
		else
			try
		{
			throw obj;       // explicit
		}
		catch(RuntimeException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

// java:22: error: unreported exception Exception; must be caught or declared to be thrown
//                         throw obj;       // explicit
//                         ^
// 1 error

```
3. This is valid

```java
class A
{
	public static void main(String[] args) {
		
		B b=new B();
		b.calculate(11000,10);
		b.calculate(1000,20);

	}
}

class B
{
	void calculate(int basic,int days)
	{
		RuntimeException obj=new RuntimeException("RuntimeException obj ");
		if(basic>=10000)
			System.out.println(basic*days);
		else
			try
		{
			throw obj;       // explicit
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
```

4. 
---





# sept 23


* Largest palindromic string


```java


class A
{
	public static void main(String[] args) {

		String s="abababaabbabacccaaaabaaaaiaaaaabaaaaa1111112111111";
		System.out.println(s.length());
		System.out.println(longestPalindrome(s));

}

		 public static String interMediate(String s,int left,int right)
		{
			if (left>right) return null;

			while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
			{

				left--;
				right++;
			}

			return s.substring(left+1,right);
		}


		public static  String longestPalindrome(String s)
		{
			if (s==null) return null;
			String longest=s.substring(0,1);
		
			for (int i=0; i<s.length()-1 ; i++) {
			 	String palindrome=interMediate(s,i,i);
			if(longest.length()<palindrome.length())
			 {
				longest=palindrome;
			 }

			 	palindrome=interMediate(s,i,i+1);
			 	if(palindrome.length()>longest.length())
			 	{
			 		longest=palindrome;
			 	}

		}

			return longest;
		}


      	

}



```


---

# Sept 26

1. If a method is throwing checked or unchecked exception it should be handled by the help or try
catch. If exception is under category unchecked like runtime exception it is not mandatory to provide 
try and catch at compile time. __JVM__ can handle it :+1:   
 __If exception are under category checked it is vital to tell at compile time using try catch that how
 you will handle it at runtime__

 > If a method is not capable to handle exception under category checked it must guard to all calling
 methods using throws keyword.\
 If a method is not throwing exception and using throws clause it should be handled properly.


2. A **Constructor** can also throw an exception.

```java

public class A
{
	public static void main(String[] args) {
		
		try
		{
		B b=new B();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	
	}
}


class B
{	
	B() throws Exception
	{

	}

}
```

3. We can throw __Custom exceptions__ on some user condition , a method can throw more than 
one exception checked or unchecked , implicitly or explicitly.
 If it is under category checked it should be handled at compile time.

4. We we create object of a class and print that object it internally calls **toString()** method
 and prints hexadecimal address using hex method.

```java

public class A
{
	public static void main(String[] args) {
		
	
		B obj=new B();
		long l=obj.hashCode();
		String hexstring=Integer.toHexString((int)l);
		String name=obj.getClass().getName();
		System.out.println(name+"@"+hexstring);

		System.out.println(obj);

	}
}


class B
{	


}

B@4cc77c2e
B@4cc77c2e



```


---



# sept 27

    :smile: :heart:

---

 :expressionless: File Operations :unamused:
   

1. We can manage input output operation on some 
standard input output devices by the help of several stream classes. The two types of stream classes are :

> :+1:  Character stream    :smile: Byte stream(8 bit data) \
 The two predefined streams can be used directly to manipulate iput output operation. These are
 	__system.in__ _input stream_ and __system.out__ , __system.err__ ( _output stream_) . \
 __System.in__ is by default associated with *keyboard* while __System.out__ and __System.err__ are associated with *monitor*.




2. We can redirect output of type *out* to a file. Output of type *err* will be visible on 
 *monitor*.

3. We can read from a keyboard using *System.in*
 As we know *System.in* is an object of Input Stream.

4. Read method returns __Integer Value__ . It's
an Integer value *equivalent* to __ASCII__ of readed character. We can read from a file or from a :+1: *keyboard buffer* . All reading will be in sequence as we know file are accessed sequentially.
> If we give 'a' as input and press enter \
  *\r*   - carriage return ASCII value  13\
  *\n*   - new line return ASCII value  10

5. We can read and write from keyboard and to monitor as well as file can be used as a standard *input/output* device.

6. We can create a file by the help of java program in order to perform *input/output* operation.

7. File is a class and can be used to create a file or a directory.


---

```java
import java.io.*;

public class FileOperations
{
  public static void main(String[] args) throws IOException {
  
    File f=new File("ui.txt");
    if (f.exists())
    {
      System.out.println("The file is there");
    }
    else
    {

      System.out.println("There is nothing as such");
      System.out.println(f.createNewFile());
      System.out.println("Now is is created");
    }
  }
}

 First time

There is nothing as such
true
Now is is created


 Second time 
The file is there


```

---

```java
import java.io.*;


class S
{
	public static void main(String[] args)	throws IOException
	 {
		
		File f=new File("D:/GEU/Semester_fifth/core-java-concepts/lecture/textfilecreated.txt");
		System.out.println(f.createNewFile());

	}
}

```

---




 :joy:  __Before__

```java

  Directory of D:\GEU\Semester_fifth\core-java-concepts\lecture

09/27/2019  07:46 PM    <DIR>          .
09/27/2019  07:46 PM    <DIR>          ..
09/27/2019  01:44 PM               186 A.java
09/27/2019  07:42 PM            23,951 README.md
09/27/2019  07:46 PM               249 S.java
               3 File(s)         24,386 bytes
               2 Dir(s)  67,851,816,960 bytes free


:imp: 	__after__

Directory of D:\GEU\Semester_fifth\core-java-concepts\lecture

09/27/2019  07:46 PM    <DIR>          .
09/27/2019  07:46 PM    <DIR>          ..
09/27/2019  01:44 PM               186 A.java
09/27/2019  07:42 PM            23,951 README.md
09/27/2019  07:46 PM               595 S.class
09/27/2019  07:46 PM               669 S.java
09/27/2019  07:46 PM                 0 textfilecreated.txt
               5 File(s)         25,401 bytes
               2 Dir(s)  67,851,816,960 bytes free

D:\GEU\Semester_fifth\core-java-concepts\lecture>

```


---

8. We can create a file within a directory provided the directory should *exist* . We can create a 
directory by the help of *File* class object.

```java
import java.io.*;


class S
{
	public static void main(String[] args)	throws IOException
	 {
		
		File f=new File("D:/GEU/Semester_fifth/core-java-concepts/lecture/findmeinparis");
		System.out.println(f.mkdir());

	}
}

```

---

Before :-1:

```java
 Volume Serial Number is 387F-AED0

 Directory of D:\GEU\Semester_fifth\core-java-concepts\lecture

09/27/2019  07:46 PM    <DIR>          .
09/27/2019  07:46 PM    <DIR>          ..
09/27/2019  01:44 PM               186 A.java
09/27/2019  07:50 PM            25,584 README.md
09/27/2019  07:46 PM               595 S.class
09/27/2019  07:51 PM               237 S.java
09/27/2019  07:46 PM                 0 textfilecreated.txt
               5 File(s)         26,602 bytes
               2 Dir(s)  67,851,812,864 bytes free

D:\GEU\Semester_fifth\core-java-concepts\lecture>javac S.java

D:\GEU\Semester_fifth\core-java-concepts\lecture>java S
true


:imp: __After__



 Directory of D:\GEU\Semester_fifth\core-java-concepts\lecture

09/27/2019  07:51 PM    <DIR>          .
09/27/2019  07:51 PM    <DIR>          ..
09/27/2019  01:44 PM               186 A.java
09/27/2019  07:51 PM    <DIR>          findmeinparis
09/27/2019  07:50 PM            25,584 README.md
09/27/2019  07:51 PM               581 S.class
09/27/2019  07:51 PM               237 S.java
09/27/2019  07:46 PM                 0 textfilecreated.txt
               5 File(s)         26,588 bytes
               3 Dir(s)  67,851,812,864 bytes free

```


---

9. Use of __mkdirs()__ to create multiple directories.

 :sunglasses: :dizzy_face:          :imp:
    :smiling_imp:
    :neutral_face:
    :no_mouth:
    :innocent:
    :alien:
    :yellow_heart:
    :blue_heart:


```java
import java.io.*;


class S
{
	public static void main(String[] args)	throws IOException
	 {
		
		File f=new File("D:/GEU/Semester_fifth/core-java-concepts/lecture/a/aa/aaa");
		System.out.println(f.mkdirs());

	}
}




D:\GEU\Semester_fifth\core-java-concepts\lecture>dir
 Volume in drive D is CRISTIANO
 Volume Serial Number is 387F-AED0

 Directory of D:\GEU\Semester_fifth\core-java-concepts\lecture

09/27/2019  07:51 PM    <DIR>          .
09/27/2019  07:51 PM    <DIR>          ..
09/27/2019  01:44 PM               186 A.java
09/27/2019  07:51 PM    <DIR>          findmeinparis
09/27/2019  07:54 PM            27,121 README.md
09/27/2019  07:51 PM               581 S.class
09/27/2019  07:54 PM               229 S.java
09/27/2019  07:46 PM                 0 textfilecreated.txt
               5 File(s)         28,117 bytes
               3 Dir(s)  67,851,812,864 bytes free

D:\GEU\Semester_fifth\core-java-concepts\lecture>javac S.java

D:\GEU\Semester_fifth\core-java-concepts\lecture>java S
true

D:\GEU\Semester_fifth\core-java-concepts\lecture>dir
 Volume in drive D is CRISTIANO
 Volume Serial Number is 387F-AED0

 Directory of D:\GEU\Semester_fifth\core-java-concepts\lecture

09/27/2019  07:55 PM    <DIR>          .
09/27/2019  07:55 PM    <DIR>          ..
09/27/2019  07:55 PM    <DIR>          a
09/27/2019  01:44 PM               186 A.java
09/27/2019  07:51 PM    <DIR>          findmeinparis
09/27/2019  07:54 PM            27,121 README.md
09/27/2019  07:55 PM               577 S.class
09/27/2019  07:54 PM               229 S.java
09/27/2019  07:46 PM                 0 textfilecreated.txt
               5 File(s)         28,113 bytes
               4 Dir(s)  67,851,812,864 bytes free

D:\GEU\Semester_fifth\core-java-concepts\lecture>cd a

D:\GEU\Semester_fifth\core-java-concepts\lecture\a>dir
 Volume in drive D is CRISTIANO
 Volume Serial Number is 387F-AED0

 Directory of D:\GEU\Semester_fifth\core-java-concepts\lecture\a

09/27/2019  07:55 PM    <DIR>          .
09/27/2019  07:55 PM    <DIR>          ..
09/27/2019  07:55 PM    <DIR>          aa
               0 File(s)              0 bytes
               3 Dir(s)  67,851,812,864 bytes free

D:\GEU\Semester_fifth\core-java-concepts\lecture\a>cd aa

D:\GEU\Semester_fifth\core-java-concepts\lecture\a\aa>dir
 Volume in drive D is CRISTIANO
 Volume Serial Number is 387F-AED0

 Directory of D:\GEU\Semester_fifth\core-java-concepts\lecture\a\aa

09/27/2019  07:55 PM    <DIR>          .
09/27/2019  07:55 PM    <DIR>          ..
09/27/2019  07:55 PM    <DIR>          aaa
               0 File(s)              0 bytes
               3 Dir(s)  67,851,812,864 bytes free

D:\GEU\Semester_fifth\core-java-concepts\lecture\a\aa>
```




10. 









# Create a new file

```java
import java.io.*;


class S
{
	public static void main(String[] args)	throws IOException
	 {
		File f=new File("D:/GEU/Semester_fifth/core-java-concepts/lecture/Jio.txt");
		System.out.println(f.createNewFile());  //true 
	}
}
```


11. What if we name the directory as "a.file".

  :rage1:
    :rage2:
    :rage3:
    :rage4:
    :suspect:
    :trollface:


    *notice a.file is dir*


```java
import java.io.*;


class S
{
	public static void main(String[] args)	throws IOException
	 {
		
		File f=new File("D:/GEU/Semester_fifth/core-java-concepts/lecture/a.file");
		System.out.println(f.mkdir());

	}
}



D:\GEU\Semester_fifth\core-java-concepts\lecture>dir
 Volume in drive D is CRISTIANO
 Volume Serial Number is 387F-AED0

 Directory of D:\GEU\Semester_fifth\core-java-concepts\lecture

09/27/2019  07:59 PM    <DIR>          .
09/27/2019  07:59 PM    <DIR>          ..
09/27/2019  07:55 PM    <DIR>          a
09/27/2019  07:59 PM    <DIR>          a.file
09/27/2019  01:44 PM               186 A.java
09/27/2019  07:51 PM    <DIR>          findmeinparis
09/27/2019  07:58 PM            30,341 README.md
09/27/2019  07:59 PM               574 S.class
09/27/2019  07:58 PM               230 S.java
09/27/2019  07:46 PM                 0 textfilecreated.txt
               5 File(s)         31,331 bytes
               5 Dir(s)  67,851,808,768 bytes free

D:\GEU\Semester_fifth\core-java-concepts\lecture>
```



12. We can display the data of file.

```java
import java.io.*;


class S
{
	public static void main(String[] args)	throws IOException
	 {
		
		File f=new File("D:/GEU/Semester_fifth/core-java-concepts/lecture/textfilecreated.txt");
		FileReader fr=new FileReader(f);
		int k;

		while((k=fr.read())!=-1)
		{
			System.out.println(k);
		}
	}
}


97
98
99
100
101
102
103
104
105
13  // carriage return       /r
10  // new line              /n 

```

13. The whole file can be displayed as

```java
import java.io.*;


class S
{
	public static void main(String[] args)	throws IOException
	 {
		
		File f=new File("D:/GEU/Semester_fifth/core-java-concepts/lecture/S.java");
		FileReader fr=new FileReader(f);
		int k;

		while((k=fr.read())!=-1)
		{
			System.out.print((char)k);
		}
	}
}



D:\GEU\Semester_fifth\core-java-concepts\lecture>javac S.java

D:\GEU\Semester_fifth\core-java-concepts\lecture>java S
import java.io.*;


class S
{
        public static void main(String[] args)  throws IOException
         {

                File f=new File("D:/GEU/Semester_fifth/core-java-concepts/lecture/S.java");
                FileReader fr=new FileReader(f);
                int k;

                while((k=fr.read())!=-1)
                {
                        System.out.print((char)k);
                }
        }
}


D:\GEU\Semester_fifth\core-java-concepts\lecture>

```


14. Some of the methods

:pouting_cat:
    :japanese_ogre:
    :japanese_goblin:
    :see_no_evil:
    :hear_no_evil:
    :speak_no_evil:

```java
import java.io.*;


class S
{
	public static void main(String[] args)	throws IOException
	 {
		
		File f=new File("D:/GEU/Semester_fifth/core-java-concepts/lecture/S.java");

		System.out.println(f.length());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.getAbsolutePath());

	}
}



D:\GEU\Semester_fifth\core-java-concepts\lecture>java S
352
true
false
D:\GEU\Semester_fifth\core-java-concepts\lecture\S.java


```


---

```java

import java.io.*;


class S
{
	public static void main(String[] args)	throws IOException
	 {
		
		File f=new File("octave.txt");

		System.out.println(f.length());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.getAbsolutePath());


		File obj=new File("nova.txt");
		System.out.println(f.renameTo(obj));

	}
}



D:\GEU\Semester_fifth\core-java-concepts\lecture>dir
 Volume in drive D is CRISTIANO
 Volume Serial Number is 387F-AED0

 Directory of D:\GEU\Semester_fifth\core-java-concepts\lecture

09/27/2019  08:22 PM    <DIR>          .
09/27/2019  08:22 PM    <DIR>          ..
09/27/2019  01:44 PM               186 A.java
09/27/2019  08:09 PM                 5 octave.txt
09/27/2019  08:16 PM            33,551 README.md
09/27/2019  08:22 PM               783 S.class
09/27/2019  08:22 PM               381 S.java
               5 File(s)         34,906 bytes
               2 Dir(s)  67,851,800,576 bytes free

D:\GEU\Semester_fifth\core-java-concepts\lecture>javac S.java

D:\GEU\Semester_fifth\core-java-concepts\lecture>java S
5
true
false
D:\GEU\Semester_fifth\core-java-concepts\lecture\octave.txt
true

D:\GEU\Semester_fifth\core-java-concepts\lecture>dir
 Volume in drive D is CRISTIANO
 Volume Serial Number is 387F-AED0

 Directory of D:\GEU\Semester_fifth\core-java-concepts\lecture

09/27/2019  08:23 PM    <DIR>          .
09/27/2019  08:23 PM    <DIR>          ..
09/27/2019  01:44 PM               186 A.java
09/27/2019  08:09 PM                 5 nova.txt
09/27/2019  08:16 PM            33,551 README.md
09/27/2019  08:22 PM               783 S.class
09/27/2019  08:22 PM               381 S.java
               5 File(s)         34,906 bytes
               2 Dir(s)  67,851,800,576 bytes free

D:\GEU\Semester_fifth\core-java-concepts\lecture>
```

---


15. *list vs ListFile*

---

```java

import java.io.*;

public class S
{
	public static void main(String[] args) {
		
	 File f=new File("D:/GEU/Semester_fifth/core-java-concepts/lecture");
	 String s[]=null;

	 if (f.isDirectory())
	 {
	 	s=f.list();
	 }

	 for(String r:s)
	 {
	 	System.out.println(r);
	 }
	}
}



D:\GEU\Semester_fifth\core-java-concepts\lecture>java S
A.java
nova.txt
README.md
S.class
S.java

D:\GEU\Semester_fifth\core-java-concepts\lecture>

```

*listFiles() returns the absolute path of files*



```java
import java.io.*;

public class S
{
	public static void main(String[] args) {
		
	 File f=new File("D:/GEU/Semester_fifth/core-java-concepts/lecture");
	 File wow[]=null;


	 if (f.isDirectory())
	 {
	 	wow=f.listFiles();
	 }

	 for(File r:wow)
	 {
	 	System.out.println(r);
	 }
	}
}



D:\GEU\Semester_fifth\core-java-concepts\lecture>java S
D:\GEU\Semester_fifth\core-java-concepts\lecture\A.java
D:\GEU\Semester_fifth\core-java-concepts\lecture\nova.txt
D:\GEU\Semester_fifth\core-java-concepts\lecture\README.md
D:\GEU\Semester_fifth\core-java-concepts\lecture\S.class
D:\GEU\Semester_fifth\core-java-concepts\lecture\S.java

D:\GEU\Semester_fifth\core-java-concepts\lecture>
```



__Example B__

```java
import java.io.*;

public class Monaco
{
  public static void main(String[] args) {
    File f=new File("D:/");

    File directories[]=null;
    directories=f.listFiles();


    for (File i : directories) {
      System.out.println(i);
    }
  }
}

D:\EL SUENO
D:\ELITE
D:\Genuine

```



__Example C__

```java
import java.io.*;

public class FileOperations
{
  public static void main(String[] args) throws IOException {
  
    File f=new File("D:\\Post Graduation\\Java\\lecture\\");
    if (f.exists())
    {
      System.out.println("The file is there");
    }
    else
    {

      System.out.println("There is nothing as such");
      System.out.println(f.createNewFile());
      System.out.println("Now is is created");
    }


    System.out.println("Checking if it is directory :"+f.isDirectory());
    System.out.println("Checking if it is file ...  :"+f.isFile());
    System.out.println(f.getAbsolutePath());


        String names[]=null;

        if (f.isDirectory())
        {      
              names=f.list();         

        for (String s : names) {
          System.out.print(s);
        }
        }



        File directories[]=null;

        if (f.isDirectory())
        {      
              directories=f.listFiles();   


        for (File directory : directories) {
          System.out.print(directory);
        }
        }






  }
}




```









---

16. A file can be used as an input/output device i.e., data can be readed from it. To perform input/output operation two types of *streams* are used:

> *Byte*\
*Stream*

17. **Stream** is sequence of data when we are using Character stream we are dealing with 16 bit while we deal with byte it is *8bit*.

18. Inorder to use stream we should follow

> openStream()\
 useStream()\
 closeStream()

19. There are several classes in support of these
stream category.

Reader  read()  | Writer    write()
 ------------ | ------------
InputStreamReader | OutPutStreamWriter
FileReader        |  PrintWriter
BufferedReader  | FileStreamWriter



20. FileReader and FileWrite class can be used to read and write to file.

21. If  file exist and have no content means is empty then read method returns -1.


# October 10

---

1. We can use  **FileWriter** constructor to create its object. If file does not exist its constructor
will __create a file__.
2. We can create its object as :

```java
FileWriter filewrite=new FileWriter("filename with directory");    
```

> We can also pass __File__ class object as a argument in **FileWriter** constructor.


3. The default value of **append** is __false__ , which is an optional argument in **FileWriter** 
constructor. This always helps to append the data that we write in the file otherwise it just replaces
everything in our file with the written data.

```java
FileWriter filewrite=new FileWriter("filename with directory",true);    
```

4. **FileWriter and FileReader** are character stream.

### IOException must be caught or declared to be thrown

```java
import java.io.*;

public class Filestuff
{
  public static void main(String[] args) throws IOException
    {
    FileWriter filewriter=new FileWriter("data.txt");

    filewriter.write("hola ahi");
    
    filewriter.close();
  }
}
```

**For the first time a new data.txt is created and "hola ahi" is written on it,**

> Even if I run this program multiple time the result is same **append=false is set in second constructor of FileWriter so we must add true inorder to append our data**.

```java
import java.io.*;

public class Filestuff
{
  public static void main(String[] args) throws IOException
    {
    FileWriter filewriter=new FileWriter("data.txt",true);

    filewriter.write("hola ahi");
    filewriter.write("hola ahi");
    
    filewriter.close();
  }
}


```

---

*After running program multiple time my data is appended not overwritten.*

### hola ahihola ahihola ahihola ahihola ahihola ahi

---

> **Using finally to close the FileWrite object whenever it is opened**

```java
import java.io.*;

public class Filestuff
{
  public static void main(String[] args) throws IOException
    {
      FileWriter filewriter=null;

  try
    {
    filewriter=new FileWriter("datos.md");
    filewriter.write("### Good Grief means when you are suprised or a ridiculous condition arises       say In your office you have to use lot of paper sheets but someday your boss says you can   use only 10sheets within a week ,then you could say   GOOD GRIEF IT IS RIDICULOUS TO TAKE JUST 10 PAPERS");
  }

  catch (Exception e) {
    System.out.println(e);
  }

  finally{
    if(filewriter!=null)
      filewriter.close();
  }
  }
}
```


5. It is vital to close a stream after usnig it ,so after  __jdk1.5__  :smile: :camel: :sparkles:
**Try with resource** came.
> Here we can use try without catch or finally but by the help of resource\

---
###A resource is an **autoclosable** object and can be used as
---



```java
try(B b=new B())
{

}
```

**B class must be closable inorder to use it in try with resource i.e it must implement closeable inter
face**




```java
import java.io.*;

public class Filestuff
{
  public static void main(String[] args) throws IOException
    {
      try(B obj=new B())
      {

      }

    }
}

class B implements Closeable{
  public void close()
  {
    System.out.println("close method is called");
  }
}



```

---

close method is called

---


6. Try without finally

```java

try(B b=new b()); FileWriter filewriter=new FileWriter("data.txt");
{
  filewriter.write("Joey");
}

class B implements closeable
{
  public void close(){

  }
}
```



7. Try to find the close() method with FileWriter class

**FileWriter is autocloseable**

```java
javap java.io.FileWriter
```



8.  To reduce input output operations on a file at different location we can use the concept of **Buffer**

> *BufferedReader*\
*BufferedWriter*


9. **readLine()** method of BufferedReader class is used to **read** content of a file __line by line__.
If file is empty it returns __null__.



10. WAP to find total number of lines in a file using readLine()



11. WAP to find number of spaces in file.

```java
import java.io.*;

public class Filestuff
{
  public static void main(String[] args) throws IOException
    {
    
    System.out.println((int)'*');

    System.out.println((int)' ');
    }
}
```

---
#32 is the ASCII value of space.
---


12. WAP to update a file if it have 500 characters by adding your name . If there are less
than 500 characters first fill 500 character by reading from initial file and then add your name.

13. We can read from a file as well as from keyboard using **BufferedReader**  class.


14. BufferedReader class takes *Reader* type value ,it is byte stream so convert to character stream.
To take input output use *System.in* .

> System.in gives 1 character only





---

#OCT 11

---



1. We can manipulate input output stream by the help of bytestream too. The two classes **InputStream**
and  **OutputStream** are used for this purpose. These classes have several subclasses with specific task


InputStream   |  OutputStream
 ------------ | ------------
 ObjectInputStream   FileInputStream | ObjectOutputStream FileOutputStream 
 DataInputStream  BufferedInputStream  |  DataOutputStream  BufferedOutputStream

---

>FileInputStream \
DataInputStream , BufferedInputStream


---

---

>FileOutputStream\
 DataOutputStream,BufferedInputStream

---


2. We can write into a file by the help of FileOutputStream if we are dealing with stream classes under
category *Byte* .We deal with 8-bit data.


3. **Writer and Reader** classes use **16bit** *Character* stream. 

4. We can use *FileWriter* class to create a new file and write a string to it on the other hand 
the *FileOutputStream* can write only single 8 bit ASCII value

```java
import java.io.*;

public class Hachiko 
{
  public static void main(String[] args) throws IOException{
      FileWriter fw=new FileWriter("usingfilewrite.txt");
      FileOutputStream fos=new FileOutputStream("usingfileoutputstream.txt"); //byte stream 8bit
      fw.write("samuel");
      fw.close();

      fos.write('a');
      fos.close();
  } 
}


* Two new files are created usingfilewrite.txt and usingfileoutputstream

usingfilewrite have samuel in it while usingfileoutputstream  have a in it.
```

5. Now lets try to write "a" instead of 'a' in fos.write i.e in object of *FileOutputStream*

```java
import java.io.*;

public class Hachiko 
{
  public static void main(String[] args) throws IOException{
      FileWriter fw=new FileWriter("usingfilewrite.txt");
      FileOutputStream fos=new FileOutputStream("usingfileoutputstream.txt"); //byte stream 8bit
      fw.write("samuel");
      fw.close();

      fos.write("a");
      fos.close();
  } 
}


no suitable method found for write(String)
                        fos.write("a");
                           ^
    method FileOutputStream.write(int) is not applicable
      (argument mismatch; String cannot be converted to int)
    method FileOutputStream.write(byte[]) is not applicable
      (argument mismatch; String cannot be converted to byte[])
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error

```

6. Try to write 

```java

      fos.write('abc');
```

---
chiko.java:11: error: unclosed character literal
                        fos.write('abc');

---

:+1:   :heart:  



###Try to send byte array to this fos  .


```java
import java.io.*;

public class Hachiko 
{
  public static void main(String[] args) throws IOException{
      

      FileOutputStream fos=new FileOutputStream("usingfileoutputstream.txt"); //byte stream 8bit
      
      String s="abc";

      byte bytearray[]=s.getBytes();


      for (byte data : bytearray) {
        System.out.println(data);
      }

      fos.write(bytearray);
      fos.close();
      
  } 
}

```


7. Using these Stream classes we write state of an object into a file and this si called *object Serailization*  . We can read object value when required. We can write only those object into a file 
which are *serializable* .The following can be used for this purpose.

> ObjectOutputStream \
ObjectInputStream 

8. We can write object into a file using write **object method**.

```java

```


9. We can make an object *serializable* by implementing an *Interface* name *serializable*. It is a 
__Marker Interface__ : are those interfaces which have no method to  be *overridden*.

10. We have to keep the order in the mind. First written will be read first . ?

11. We can read from a file by the help of read object method this method returns object which should be downcasted properly in order to use.

12. We can't write a method to a file but a *variable* can be written. If we want to avoid a variable from saving into the file we must declare it *transient*.

```java
transient int i=1;
```




13. 


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

---

---


#Threading


1. Thread is a programme in execution. It is lightweight process two or more thread can execute 
controlling each other *sharing common resource*.As threads are sharing same resources(memory) . So
are called light weight process.


2. Execution of a Thread starts with its lifecycle so there is no need of main method in the thread
program?

3. There is atleast one thread running a program named *main* thread. Main thread can control another threads.

4. We can create thread in two ways.

> *By extending Thread class*\
By implementing Runnable Interface


5. We can extend a *Thread* class to create a thread.
6. A *Thread* class have several methods to follow its lifecycle like start(),sleep(),stop(),wait().
In order to perform some task by a thread we have to override *run()* method of it.


```java
import java.io.*;

public class Hachiko 
{
  public static void main(String[] args){
        

  } 
}


class B extends Thread{
  public void run()
  {

  }
}
```

---

7. We can start execution of a thread by calling start method on it. *start* method internally calls
*run()* method.

8. When we call *start()* method on threads all thread will go into *Runnable* state. *Runnable* is always ready to run.

9. We can Interrupt execution of a thread for a while using sleep() method on it.

> *sleep()* method works on current object. \
It throws **checked** exception named *InterruptedException* .

10. *sleep()* method blocks current object  i.e., from where it is called it blocks that object.



---












---


1. We can create thread in two ways

> *By extending Thread class\
*By implementing Runnable interface*


```java
class A extends Thread
{
  public void run()
  {
    for(int i=0;i<5;i++)
      System.out.println("From A ..."+i);

    System.out.println("Bye     A");
  }
}

class B extends Thread
{
  public void run()
  {
    for(int i=0;i<5;i++)
      System.out.println("From B ..."+i);

    System.out.println("Bye     B");
  }
}

class C extends Thread
{
  public void run()
  {
    for(int i=0;i<5;i++)
      System.out.println("From C ..."+i);

    System.out.println("Bye     C");
  }
}


public class ThreadTest
{
  public static void main(String[] args) {
    new A().start();
    new B().start();
    new C().start();
  }
}



D:\Post Graduation\Java\lecture>java ThreadTest
From A ...0
From C ...0
From B ...0
From C ...1
From A ...1
From C ...2
From B ...1
From C ...3
From A ...2
From C ...4
From B ...2
Bye     C
From A ...3
From A ...4
From B ...3
Bye     A
From B ...4
Bye     B

```


2. Execution of a thread follows its lifecyle


> 1. *Newborn state*\
*Runnable state*\
*Running state*\
*Blocked state*\
*Dead state*\





 * __Newborn__ : A thread is born . We can do two things with this-

 Newborn--->start() ---> *Runnable*
 Newborn--->stop()  ---> *Dead state*



 * __Runnable__  : The *runnable* state means that the thread is ready for *execution* and it is waiting
 for the availability of the processor.

  Running Thread ---> yield() ---> __Runnable Thread__


 * __Running__  : *Running* means that the processor has given its time to the thread for its *execution*. 

  *Running* ---> suspend(),sleep(),wait() [wait() can be scheduled to run again using notify() ] ---> Blocked state

 * __blocked__  : means a thread is prevented from entering into the runnable state subsequently *running* state

 * __Dead state__: when a thread has completed executing its *run()* method.



---

1. Use of *yield()* , *stop()* and *sleep()* method.

> yield() method in thread A at iteration i=1,has relinquished its control to the thread B.
The *stop()* in thread B has killed it after implementing for loop thrice. 
 


```java

class A extends Thread
{
  public void run()
  {
    for(int i=0;i<=4;i++)
    {
      if(i==1)
        yield();

      System.out.println("From thread  A  "+i);
    }

    System.out.println("Bye from A");
  }
}

class B extends Thread
{
  public void run()
  {
    for(int i=0;i<=4;i++)
    {
      if(i==3)
        stop();

      System.out.println("From thread  B  "+i);
    }

    System.out.println("Bye from B");
  }
}



class C extends Thread
{
  public void run()
  {
    for(int i=0;i<=5;i++)
    {
      System.out.println("From c"+i);
      if(i==3)
      try
      {
        sleep(3000);
      }
      catch (Exception e)
      {

      }
    }

    System.out.println("Bye from C");
  }
}





public class ThreadTest
{
  public static void main(String[] args) {
    A threadA=new A();
    B threadB=new B();
    C threadC=new C();


    System.out.println("Start thread A");
    threadA.start();


    System.out.println("Start thread B");
    threadB.start();


    System.out.println("Start thread C");
    threadC.start();



    System.out.println("This is the end of main thread");
  }
}



Start thread A
Start thread B
Start thread C
This is the end of main thread
From c0
From thread  B  0
From thread  A  0
From thread  B  1
From c1
From thread  B  2
From thread  A  1
From c2
From thread  A  2
From c3
From thread  A  3
From thread  A  4
Bye from A
From c4
From c5
Bye from C


```

# Using priority with thread

```java
class A extends Thread
{
  public void run()
  {
    System.out.println("A is started");
    for(int i=0;i<=10;i++)
    {

      System.out.println("From thread  A  "+i);
    }

    System.out.println("Bye from A");
  }
}

class B extends Thread
{


  public void run()
  {
    System.out.println("threadB started");
    for(int i=0;i<=10;i++)
    {
    
      System.out.println("From thread  B  "+i);
    }

    System.out.println("Bye from B");
  }
}



class C extends Thread
{
  public void run()
  {
    System.out.println("threadC started");
    for(int i=0;i<=10;i++)
    {
      System.out.println("From thread C"+i);
    
    }

    System.out.println("Bye from C");
  }
}





public class ThreadTest
{
  public static void main(String[] args) {
    A threadA=new A();
    B threadB=new B();
    C threadC=new C();


    threadC.setPriority(Thread.MAX_PRIORITY);
    threadB.setPriority(threadA.getPriority()+1);

    threadA.setPriority(Thread.MIN_PRIORITY);


    System.out.println(threadA.getPriority());
    System.out.println(threadB.getPriority());
    System.out.println(threadC.getPriority());

    System.out.println("Start thread A");
    threadA.start();


    System.out.println("Start thread B");
    threadB.start();


    System.out.println("Start thread C");
    threadC.start();



    System.out.println("This is the end of main thread");
  }
}


 





D:\Post Graduation\Java\lecture>java ThreadTest
1
6
10
Start thread A
Start thread B
A is started
Start thread C
threadB started
This is the end of main thread
threadC started
From thread  B  0
From thread C0
From thread  B  1
From thread C1
From thread  B  2
From thread C2
From thread  B  3
From thread C3
From thread  B  4
From thread C4
From thread  B  5
From thread C5
From thread  B  6
From thread  A  0
From thread C6
From thread  A  1
From thread  B  7
From thread  A  2
From thread C7
From thread C8
From thread C9
From thread C10
From thread  A  3
From thread  B  8
From thread  A  4
Bye from C
From thread  A  5
From thread  B  9
From thread  A  6
From thread  B  10
From thread  A  7
Bye from B
From thread  A  8
From thread  A  9
From thread  A  10
Bye from A

D:\Post Graduation\Java\lecture>

```

---




# Synchronization


# Implementing the 'Runnable interface'








3. A __Thread__ class have several methods to follow its lifecycle like start,sleep(). In order
to perform some task by a thread we have to override run() method of it.


```java
A{
  class B extends Thread 


  {
    pbilc void run()
    {

    }
  }
}
```


4. We can start execution of a thread by calling start method on it. Start method internally calls 
run() method on it.

5. When we call start method on threads all thread will go into *Runnable* mode. Runnable means
ready to run.

6. We can interrupt execution of a thread for a while using sleep( method on it.)

> sleep() method works on current object . Also it throws exception named InterruptedException under category.

---

7. Sleep method blocks current object i.e. from where it is called it blocks that object.

---

8. Anonymous class?

9. 

```java
class Lyon
{
  public static void main(String[] args) {
    Thread t=Thread.currentThread();


    System.out.println("Current thread  ***********"+t);

    t.setName("This is my bitch");

    System.out.println("Changed the name"+t);


    try{
      for(int i=5;i>0;i--)
      {
        System.out.println(i);
        Thread.sleep(1000);  //ms
      }
    }
    catch (Exception e)
    {
      System.out.println(e);
      System.out.println("Interruption in main thread");
    }
  }
}
```





#OCT 12

---




```java
public class A{

  public static void main(String[] args) {
    B b=new B()
    {
      void show() 
      {}
      void display()
      {}  


    };
  }
}


abstract class B{
  abstract void show();
}
```



2. int a[10]  10 shouldn't be written here because memory to this array a will be allocated with
the help of *new* but **new** always allocated memory at run time.

```java
int a[]=new int[10];
```

3. __Anonymous array__

```java
public class A{

  public static void main(String[] args) {

    int array[]=new int[]
    {
      1,2,3
    };

    for (int element :array ) {
      System.out.println(element);
    }
}


}

```

---
output

1
2
3

---




4. In the same manner *Thread* class can be used anonymously.

> second hola is printed after 5 seconds.  \
*sleep()* method is always throws InterruptedException so it must be handled at compile time so
that it can be resolved at run time.

```java
public class A{

  public static void main(String[] args)  throws InterruptedException{
  
    Thread t1=new Thread(){

    public void run(){

                 }

  };

    System.out.println("Hola");
    t1.sleep(5000);
    System.out.println("Hola");


  }


}



```

---





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








---


5. Example .

```java
public class A{

  public static void main(String[] args)  throws InterruptedException{
  
    Thread t1=new Thread(){

    public void run(){

                 }

  };

    t1.start();

  }


}


```


6. This too works 


```java
public class A{

  public static void main(String[] args)  throws InterruptedException{
  
    Thread t1=new Thread(){};
    System.out.println(t1.getName());
}

}


```


7. Printing *Thread* class object gives  name,priority,group when __default__ constructor is given.

> Thread[Thread-0,5,main]

```java
public class A{

  public static void main(String[] args)  throws InterruptedException{
  
    Thread t1=new Thread(){};
    System.out.println(t1);
}

}

```

8. When *default constructor* isn't used 

```java


```

9. *setName()*

```java
public class A{

  public static void main(String[] args)  throws InterruptedException{
  
  Thread a=new Thread();
  Thread b=new Thread();

  System.out.println(a);
  System.out.println(b);

  a.setName("first");
  b.setName("second");


  System.out.println(a);
  System.out.println(b);

  Thread c=new Thread();
  System.out.println(c);

}

}


o/p 
Thread[Thread-0,5,main]
Thread[Thread-1,5,main]
Thread[first,5,main]
Thread[second,5,main]
Thread[Thread-2,5,main]

```


10. *isAlive()*


11. Any of the thread can start .

```java
public class A{

  public static void main(String[] args)  throws InterruptedException{
  
    B b=new B();
    C c=new C();

    b.start();
    c.start();

  }

}


class B extends Thread
{
  public  void run()
  {
    for (int i=0; i<7 ;++i ) {
      try{
        System.out.println(i);
        sleep(100);

      }
      catch (Exception e)
      {
        System.out.println(e);
      }
    }
  }
}


class C extends Thread
{
  public  void run()
  {
    for (int i=0; i<7 ;++i ) {
      try{
        System.out.println(i);
        sleep(30);
      }
      catch (Exception e)
      {
        System.out.println(e);
      }
    }
  }
}



0
0
1
2
3
1
4
5
6
2
3
4
5
6

If b  and c are printed

b
c
c
c
c
b
c
c
c
b
b
b
b
b

```






12. *join()* method makes one thread to execute first and finish it.

```java
public class A{

  public static void main(String[] args)  throws InterruptedException{
  
    B b=new B();
    C c=new C();

    b.start();
    b.join();
    c.start();

  }

}


class B extends Thread
{
  public  void run()
  {
    for (int i=0; i<7 ;++i ) {
      try{
        System.out.println('b');
        sleep(100);

      }
      catch (Exception e)
      {
        System.out.println(e);
      }
    }
  }
}


class C extends Thread
{
  public  void run()
  {
    for (int i=0; i<7 ;++i ) {
      try{
        System.out.println('c');
        sleep(30);
      }
      catch (Exception e)
      {
        System.out.println(e);
      }
    }
  }
}





b
b
b
b
b
b
b
c
c
c
c
c
c
c


```


---




---
# OCT 15

1. __Daemon Thread__:




2. __Runnable Interface__: *Runnable* interface have only one method *run()* which should be
overridden to preform some task. We can create Thread object by passing runnable instance in its 
constructor to call start method.

```java
public class ThreadTest

{
  public static void main(String[] args) {
    B b=new B();
    Thread obj=new Thread(b);
    obj.start();
  }
}


class B implements Runnable
{
  public void run()
  {
    System.out.println("hola");
  }
}
```


3. Two or more *Thread* can share common resource.

```java
public class ThreadTest

{
  public static void main(String[] args) {
    D d=new D();
    B b=new B(d);
    b.start();
    C c=new C(d);
    c.start();
  }
}


class D
{
  synchronized void print(int n)
  {
    for(int i=0;i<=10;i++)
    {
      try{
        Thread.sleep(1000);
      }
      catch (Exception e)
      {

      }
      System.out.println(n*i);
    }
  }
}

class B extends Thread 
{
  D d;
  B(D d)
  {
    this.d=d;
  }
  public void run()
  {
    d.print(7);
  }
}


class C extends Thread 
{
  D d;
  C(D d)
  {
    this.d=d;
  }
  public void run()
  {
    d.print(11);
  }
}

0
7
14
21
28
35
42
49
56
63
70
0
11
22
33
44
55
66
77
88
99
110

```
       
  * We can remove try catch from synchronized void print()

```java
public class ThreadTest

{
  public static void main(String[] args) {
    D d=new D();
    B b=new B(d);
    b.start();
    C c=new C(d);
    c.start();
  }
}


class D
{
  synchronized void print(int n)
  {
    for(int i=0;i<=10;i++)
    {
      
      System.out.println(n*i);
    }
  }
}

class B extends Thread 
{
  D d;
  B(D d)
  {
    this.d=d;
  }
  public void run()
  {
    d.print(7);
  }
}


class C extends Thread 
{
  D d;
  C(D d)
  {
    this.d=d;
  }
  public void run()
  {
    d.print(11);
  }
}


```


4. *Thread Synchronization* is a way to deal with deadlock like condition. We can use synchronized
keyword for this purpose .
**Synchronized** can be used with a method that is going to share common resource -:

```java
synchronized void print()
{

}
```


5. We can also use synchronized keyword with object using synchronized block



6. Make the method  *static* in order to show synchronization.

```java
public class ThreadTest

{
  public static void main(String[] args) {
      
      new B().start();
      new C().start();
  }
}


class D
{
    static void print(int n)
  {
    for(int i=0;i<=10;i++)
    {
      
      System.out.println(n*i);
    }
  }
}

class B extends Thread 
{
  public void run()
  {
    D.print(7);
  }
}


class C extends Thread 
{
  public void run()
  {
    D.print(11);
  }
}


```



---



# OCT 18

---

1. We can process inter thread communication by the help of *wait* and *notify*.

2. Applets are programs executed by the help of another program like AppletViewer( a tool provided by
JDK ) or in a java enabled web browser like Mozilla.
  * Applets are used to develop *GUI* applications.

> Execution of an applet starts with its lifecycle so there is no need of **main** method in it. \
We can create an Applet class by extending __Applet__ class that is part of *Applet* package.

```java
import java.applet.Applet;

```

3. An *applet* is a panel window on which we can draw some graphical object like circle,rectangle.
4. We can place some string on panel window also different awt controls can be set on panel window like button,label,textfield,checkBox,menubar.
5. Execution of an applet follow a lifecycle.

```
init()  ---> start() ---pain()
               |
             stop()  -->destroy()
```

6. The *init()* method is used to perform some vital task by an applet like initialization of things it
is called only once.



7. Applet class can be compiled as usual.

8.
```java
 <applet code="nameofclass" width="" height=""></applet>

```

9. The super class of Applet is Panel.

> Component  ->  Container -> Panel -> Applet

10. 

```java
import java.applet.Applet;

public class MyApplet extends Applet
{
  

  String s="Vue";
  int counter=0;

  public void init()
  {
    System.out.println("Initialization");
  }
  public void start()
  {
    s=s+ counter++;
    System.out.println(s+"within start");
  }
  public void stop()
  {
    s=s+ counter++;
    System.out.println(s+"within stop");
  }
  public void Destroy()
  {
    System.out.println("Destruction");
  }

}
```


5. We can draw some graphical object or a string on a panel window by the help of paint method.
Paint method is called via *start* method and can be overridden.
6. Graphics class is part of awt package and memory to this object is allocated internally using 
*getGraphics()* method.


```java
import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet
{
  
  Graphics g;

  public void init()
  {
    g=getGraphics();


    System.out.println(g);
  }



}

sun.java2d.SunGraphics2D[font=java.awt.Font[family=Dialog,name=Dialog,style=plain,size=12],
color=java.awt.SystemColor[i=9]]
```



7. Use **paint()** method to display various shapes.

```java
import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet
{
  
  

  public void paint(Graphics g)
  {
    g=getGraphics();

    g.drawString("Hola",50,50);
  }



}
```



8. *setBackground()* , *setForeground()* takes Color.colorname.

These methods take argument of type color. Color is a class we can use its static perdefined object
like Color.red, Color.blue or just simply create a new Color object by placing rgb() values.

```java
Color teal=new Color(0,128,128);

```



```java

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;

public class MyApplet extends Applet
{
  
  

  public void paint(Graphics g)
  {
    g=getGraphics();
    Color teal=new Color(0,128,128);
    g.drawString("Hola",50,50);
    setBackground(teal);
    setForeground(Color.red);
    // setColor(Color.white);
    g.drawString("jskfd",100,100);
    g.setColor(Color.yellow);
  }



}


```


6. **Draw** some graphical objects like line various shapes.

```java
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;

public class MyApplet extends Applet
{
  
  

  public void paint(Graphics g)
  {
    g=getGraphics();
    g.drawRect(100,100,100,100);
    g.drawOval(100,100,100,100);
    g.drawOval(80,80,141,141);
    setBackground(Color.red);
  }



}

```


7. Adding Button ...

```java
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;

public class MyApplet extends Applet
{
  
 Button b;
 public void init()
 {
  b=new Button("add");
  add(b);
 }



}

```


---


