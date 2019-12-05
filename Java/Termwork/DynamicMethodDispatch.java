class DynamicMethodDispatch{
	public static void main(String[] args) {
		 	
		 	A obj=new B();
		 	obj.show();

		 	A objD=new D();
		 	objD.show();
	}
}


class A{

	void show(){
		System.out.println("show method of A");
	}
}

class B extends A{

	void show(){
		System.out.println("show method of B");
	}
}

class C extends A{
	void show(){
		System.out.println("show method of C");
	}
}


class D extends A{
	void show(){
		System.out.println("show method of C");
	}
}