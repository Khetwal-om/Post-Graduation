


# Java Database 


1. Introduction


---


```java
package com.company;
import java.sql.*;



public class Main {



    public static void main(String[] args) throws Exception{
	// write your code here

        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","1116");
        Statement statement=con.createStatement();
        statement.executeUpdate("insert into pal values('James',19)");
        statement.executeUpdate("insert into pal values('Harshit',20)");



    }
}
```

---



# 23 January



---


:+1:


1. After connection establishment we have to execute some queries. The following approaches can be followed 
  1. executeUpdate()
  2. executeQuery()
  3. execute()
  
  
1. *executeUpdate()* :



```java
package com.company;
import java.sql.*;


public class Main{
    public static void main(String[] args) throws Exception{
        System.out.println("java database concepts");

        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","1116");
        Statement st=con.createStatement();
        st.executeUpdate("insert into pal values('john doe',19)");
        st.executeUpdate("insert into pal values('Hilary',19)");
        st.executeUpdate("insert into pal values('Don Bosco',21)");

        st.executeUpdate("update pal set age=22 where name='Hilary'");

        st.executeUpdate("delete from pal where age=22");
        
        




    }
}




```




---

1. It returns integer value.

```java

package com.company;
import java.sql.*;


public class Main{
    public static void main(String[] args) throws Exception{
        System.out.println("java database concepts");

        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","1116");
        Statement st=con.createStatement();
        st.executeUpdate("insert into pal values('john doe',19)");
        st.executeUpdate("insert into pal values('Hilary',19)");
        st.executeUpdate("insert into pal values('Don Bosco',21)");

        st.executeUpdate("update pal set age=22 where name='Hilary'");

        int i=st.executeUpdate("delete from pal where age=22");

        System.out.println(i);





    }
}


```


**Dynamically insert the values in the database**

```java

package com.company;
import java.sql.*;
import java.util.*;


public class Main{
    public static void main(String[] args) throws Exception{
        System.out.println("java database concepts");

        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","1116");
        Statement st=con.createStatement();

        Scanner input=new Scanner(System.in);
        String name;
        int age;

        System.out.println("Enter the name   :");
        name=input.next();
        System.out.println("Enter the age");
        age=input.nextInt();


        st.executeUpdate("insert into pal values('"+name+"','"+age+"')");




    }
}




**ResultSet**


```java
package com.company;
import java.sql.*;
import java.util.*;


public class Main{
    public static void main(String[] args) throws Exception{
        System.out.println("java database concepts");

        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","1116");
        Statement st=con.createStatement();


        ResultSet resultset=st.executeQuery("select * from pal");
        while(resultset.next()){
            System.out.print(resultset.getString(1));
            System.out.print(resultset.getString(2)+"    ");
        }

    }
}
```








**getResultSet**


```java
package com.company;
import java.sql.*;
import java.util.*;


public class Main{
    public static void main(String[] args) throws Exception{
        System.out.println("java database concepts");

        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","1116");
        Statement st=con.createStatement();


        ResultSet resultset;
        boolean isOkay=st.execute("select * from pal");
        if(isOkay){
            resultset=st.getResultSet();
            while (resultset.next()) {
                System.out.print(resultset.getString(1));
                System.out.println(resultset.getString(2));

            }
        }







    }
}



```





---





2. *executeQuery()*  :


3. *execute()*       :  






---



# Insert image in database



1. To insert image into the database.



```java   
  
package com.company;
import java.sql.*;
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        System.out.println("java database concepts");

        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","1116");

        File file=new File("D://A.png");

        PreparedStatement ps=con.prepareStatement("insert into animal values(?)");
        FileInputStream fis=new FileInputStream(file);


        ps.setBinaryStream(1,fis,(int)file.length());
        ps.execute();
        fis.close();

    }
}
  
  
```



2. To retrieve image from the database


```java
package com.company;
import java.sql.*;
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        System.out.println("java database concepts");

        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","1116");
        File f1=new File("D://A.png");
        FileOutputStream fos=new FileOutputStream(f1);

        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from animal");
        rs.next();
        fos.write(rs.getBytes(1));
        fos.close();


    }
}


```

### Both the concepts :


:heart:


---


```java

package com.company;
import java.sql.*;
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        System.out.println("java database concepts");

        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","1116");

        File file=new File("D:\\Django-Images\\C.jpg");

        PreparedStatement ps=con.prepareStatement("insert into animal values(?)");
        FileInputStream fis=new FileInputStream(file);


        ps.setBinaryStream(1,fis,(int)file.length());
        ps.execute();
        fis.close();


        File f1=new File("D:\\Django-Images\\O.jpg");
        FileOutputStream fos=new FileOutputStream(f1);

        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from animal ");
        rs.next();
        fos.write(rs.getBytes(1));
        fos.close();
        

    }
}





```

---




### Savepoint


1. **con.setAutoCommit()** is true by default , we can change it to false.
 *After creation of savepoints we can rollback them*


```java
package com.company;
import java.sql.*;
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        System.out.println("java database concepts");

        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","1116");

        con.setAutoCommit(false);
        Statement st=con.createStatement();

        st.executeUpdate("insert into pal values ('Harshit',23)");
        st.executeUpdate("insert into pal values ('Varun',22)");
        st.executeUpdate("insert into pal values ('Tanya Moti nai h',26)");
        st.executeUpdate("insert into pal values ('Gopi',27)");
        st.executeUpdate("insert into pal values ('Satveer',29)");
        st.executeUpdate("insert into pal values ('Sankie',21)");

        Savepoint batchmates=con.setSavepoint();

        st.executeUpdate("insert into pal values ('Hojo',25)");
        st.executeUpdate("insert into pal values ('Khati',25)");
        st.executeUpdate("insert into pal values ('Pravesh',24)");
        Savepoint shivalikwale=con.setSavepoint();



        con.rollback(batchmates);
        
        
        
        con.commit();



    }
}



```





### The last savepoint is committed.





```java
package com.company;
import java.sql.*;
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        System.out.println("java database concepts");

        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","1116");

        con.setAutoCommit(false);
        Statement st=con.createStatement();

        st.executeUpdate("insert into pal values ('Harshit',23)");
        st.executeUpdate("insert into pal values ('Varun',22)");
        st.executeUpdate("insert into pal values ('Tanya Moti nai h',26)");
        st.executeUpdate("insert into pal values ('Gopi',27)");
        st.executeUpdate("insert into pal values ('Satveer',29)");
        st.executeUpdate("insert into pal values ('Sankie',21)");

        Savepoint batchmates=con.setSavepoint();

        st.executeUpdate("insert into pal values ('Hojo',25)");
        st.executeUpdate("insert into pal values ('Khati',25)");
        st.executeUpdate("insert into pal values ('Pravesh',24)");
        Savepoint shivalikwale=con.setSavepoint();

        con.rollback(shivalikwale);
        con.rollback(batchmates);

        con.commit();







    }
}














```



```sql

Harshit	23
Varun	22
Tanya Moti nai h	26
Gopi	27
Satveer	29
Sankie	21


```




### All the calls can be avoided using batchUpdate


```java
package com.company;
import java.sql.*;
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        System.out.println("java database concepts");

        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","1116");

        Statement st=con.createStatement();


        st.addBatch("delete  from pal");

        st.addBatch("insert into pal  values('Hojo',21)");
        st.addBatch("insert into pal  values('Khati',22)");
        st.addBatch("insert into pal  values('Jerry',25)");
        st.addBatch("insert into pal  values('Mandy',23)");
        st.addBatch("insert into pal  values('Money',27)");


        int a[]=st.executeBatch();
        System.out.println(a[0]);










    }
}





```