import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class A extends Applet
{
    

    CheckboxGroup cfg;
    Checkbox c1,c2;


    public void init(){
      cfg=new CheckboxGroup();
      c1=new Checkbox("Machine learning",false,cfg);
      c2=new Checkbox("Artificial Intelligence",false,cfg);
      add(c1);
      add(c2);
    }


  
  
}
/* <applet code="A" width=500 height=500>
</applet>*/


// public class Seven extends Applet implements ItemListener{
// 	Checkbox c1,c2,c3;
// 	public void init(){
// 	      c1=new Checkbox("Football");
// 	      c2=new Checkbox("Cricket");
// 	      c3=new Checkbox("Basketball");

// 	      add(c1);
// 	      add(c2);
// 	      add(c3);	
// 	}
// }