import java.util.*;

public class Salubrious
{
	public static void main(String[] args) {
		int array[]={1,2,3,2,6};



		Vector<Integer> vobj=new Vector();
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!=2)
			{
				vobj.add(array[i]);
			}
		}

		System.out.println(vobj);
		System.out.println(vobj.contains(1));

		// System.out.println(vobj.size());
	    array=new int[vobj.size()];

	    for(int k=0;k<vobj.size();k++)
	    {
		    	// Integer x=k;
	    	array[k]=vobj.get(k);
	    }


	 	for (int  element: array) {
			{
				System.out.println(element);
			}
		}












		// Vector vobj=new Vector();
		// for (int  element: array) {
		// 	if(element!=2)
		// 	{
		// 		vobj.add(element);
		// 	}
		// }

		// System.out.println(vobj);
	}
}