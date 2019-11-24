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