
class Test
{
  public static void main(String[] args) {
    String s1="acc";
    String s2="acc";


    System.out.println("This is to verfiy that s1 and s2 points to the same memory location");
    
    System.out.println(System.identityHashCode(s1));
    System.out.println(System.identityHashCode(s2));


    System.out.println("When memory is assigned with the help of new keyword above concept get changed");

    String s3=new String("fan");
    String s4=new String("fan");



    System.out.println(System.identityHashCode(s3));
    System.out.println(System.identityHashCode(s4));
  }
}


