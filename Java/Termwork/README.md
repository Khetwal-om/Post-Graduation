# Termwork Questions


:yellow_heart:   


1. Use of super and this in a single compilation unit.

```java
class One{
	public static void main(String[] args) {
		B obj=new B();
		obj.display();
	}
}

class C{
  void show(){
  	System.out.println("This is the show method of Parent class C");
  }
}

class B extends C{
	void show(){
		System.out.println("This is the show method of child class B");
	}

	void display(){
		show();
		super.show();
		this.show();
	}


}


```








2. Convert 2D array to 1D array.

```java
class Second{
	public static void main(String[] args) {
		int twoD[][]={{1,2,3},{4,6},{7,4},{3,7,9,10,11,7}};
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


	}
}


```


---
**Sorting is   done**

---

```java
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

```







3. 

```java
import java.util.Arrays;
class Third{
	public static void main(String[] args) {
		String s="ssspppqqqqabcdefabcde";
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
```


4. Enter some values in vector and traverse:

> real values after decimal\
sum of digits of integer values\
string in reverse order


```java
import java.util.Vector;
import java.util.Iterator;

class Four{
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(1.3434);
		v.add("abcde");
		v.add('h');
		// System.out.println(v);	
		int k=0;	

		// String string="ab.i";
		// System.out.println(string.lastIndexOf("."));

		// Iterator value=v.iterator();
		// while(value.hasNext()){
		// 	System.out.println(value.next().getClass().getName());
		// }


		for(int i=0;i<v.size();i++){
			// System.out.println(v.get(i));
			String name=v.get(i).getClass().getName();
			k=name.lastIndexOf(".");
			String answer=name.substring(k+1);
			// System.out.println(answer);

			if(answer.equals("Double")){
				String s=v.get(i).toString();


				// String s=(String)v.get(i);
				int u=s.lastIndexOf(".");
				System.out.println(s.substring(u+1));
			}
			else if(answer.equals("String")){

				StringBuffer sbr=new StringBuffer(v.get(i).toString());
				sbr.reverse();
				System.out.println(sbr.toString());

			}
			else if(answer.equals("Integer")){
				int number=(int)v.get(i);
				// System.out.println(number*10);
				int sum=0;
				while(number!=0){
					int remainder=number%10;
					sum+=remainder;
					number=number/10;

				}
				System.out.println(sum);


			}


		}

	}
}
```


5. Check the second command line argument is reverse of the first one . Print "yes" otherwise "no"

```java
class Five{
	public static void main(String[] args) {


		System.out.println(args[0]);
		System.out.println(args[1]);

		StringBuffer sbr=new StringBuffer(args[1]);
		sbr.reverse();
		String second=sbr.toString();
		

		if(args[0].equals(second))
			{
				System.out.println("Yes");
			}
		else
			{
				System.out.println("No");
			}



	}
}
```


**Approach||**  


```java
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

``` 


6. Create a substring from "12324456554" and resultant string should contain only
even digits but only once.

```java
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

```



7. 

```java
import java.util.*;
class Seven{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the age");

		Exception exception=new Exception("exception as age is below");
		int age=input.nextInt();

		try
		{
			 checkAge(age);
		}
		catch (AgeException e){
			 System.out.println(e);
		}


		System.out.println("The entered age is"+age);	

	}

	public static void checkAge(int age) throws AgeException{

		if(age<18){
			throw new AgeException("Age smaller than 18");
		}

		else if(age>60){
			throw new AgeException("Too old Sir  :) ");
		}
		else{
			System.out.println("Welcome ");
		}

}
}


class AgeException extends Exception{
	AgeException(String m){
		super(m);
	}
}
```



---


###Random 


```java
import java.util.*;
import java.io.*;

class Test{
	public static void main(String[] args) {


		HashSet h=new HashSet();
		h.add(12);
		h.add(45);
		h.add("abcdefghijklmnopqrstuvwxyz");
		// System.out.println(h);


		Iterator iter=h.iterator();
		while(iter.hasNext()){
			 System.out.println(iter.next().getClass().getSimpleName()+"  ");
		}

		// for(int i=0;i<h.size();i++){
		// 	System.out.println(h.get(i));
		// }


		Integer i=7;
		Integer k=7;
		System.out.println(System.identityHashCode(i));
		System.out.println(System.identityHashCode(k));

		String
		Integer
		Integer
		736709391
		736709391


	}
}
```

---