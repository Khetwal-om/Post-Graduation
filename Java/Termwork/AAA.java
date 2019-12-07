class AAA
{

public static void main(String args[])
{

A obj = new A();
System.out.println(obj);//coded third line similarly
System.out.println(obj.hashCode());
System.out.println("A"+"@"+Integer.toHexString((int)obj.hashCode()));
}


}