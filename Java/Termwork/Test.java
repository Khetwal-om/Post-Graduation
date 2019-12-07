
class Student{
		int marks;
	public void setMarks(int marks){
		this.marks=marks;
	}

	public int getMarks(){
		return this.marks;
	}
}

interface Sports{
	
	public void sportsGrades(int grade);
}


class Test extends Student implements Sports{
	 static int grade;
	public void sportsGrades(int grade){
		
		System.out.println(grade);
	}

	public void display(){
		System.out.println(getMarks());
		sportsGrades(10);
	}


	public static void main(String[] args) {
			Test obj=new Test();
			obj.setMarks(100);
			obj.display();

	}
}