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