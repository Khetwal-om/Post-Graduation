class GarbageCollection{
	public static void main(String[] args) {
		B b=new B();
		b=new B();

		System.gc();
	}
}


class B{
	public void finalize(){
		System.out.println("finalize method called");
	}
}