import java.util.*;

class ImplementStack{
	public static void main(String[] args) {
		Vector stack=new Vector();
		Scanner input=new Scanner(System.in);

		int choice=1;
		
		while(choice!=4){

			System.out.println("Enter the choice");
			System.out.println("1 Push");
			System.out.println("2 Pop");
			System.out.println("3 Display");
			System.out.println("4 Bye");
			choice=input.nextInt();



			if(choice==1){
				push(stack);
			}
			else if(choice==2){
				if(stack.size()==0)	
				{
					System.out.println("No elements to pop");
				}
				else{
					pop(stack);
				}
			}
			else if(choice==3){
					display(stack);
			}
			else{
				System.out.println("Wrong choice");
			}


		}






	}

	public static void push(Vector stack){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the element that you wanna enter");
		int data=input.nextInt();
		stack.add(data);
		System.out.println("I am in push");

	}
	public static void pop(Vector stack){
		stack.remove(stack.size()-1);
		System.out.println("I am in pop");
	}
	public static void display(Vector stack){
		System.out.println("I am in display");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println(stack);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^");


	}
}