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