

1. Creating database

```php

<?php 

 $servername="localhost";
 $username="root";
 $password="";


 $conn= new mysqli($servername,$username,$password);

 if($conn->connect_error){
 	die("Connection      is failed".$conn->connect_error);
 }
 echo "Welcome !!! successful connection";


// database

 $sql="CREATE DATABASE myDB";
 if($conn->query($sql)===TRUE){
 	echo "Database created successfully";
 }
 else{
 	echo "Error in creating database".$conn->error;
 }


$conn->close();

 ?>
 ```



2. Table is created


```php

<?php 

 $servername="localhost";
 $username="root";
 $password="";
 $dbname="myDB";



 $conn= new mysqli($servername,$username,$password,$dbname);

 if($conn->connect_error){
 	die("Connection      is failed".$conn->connect_error);
 }
 echo "Welcome !!! successful connection";

$sql="CREATE TABLE STUDENT (
  roll_no varchar(20),
  name varchar(20),
  course varchar(20),
  sem int(6) primary key
)";



if($conn->query($sql)===TRUE){
	echo "Student table is created";
}
else{
	echo "Something is wrong .  FIx me".$conn->error;
}



$conn->close();




 ?>
 ```



3.  Record is inserted


```php

<?php 

 $servername="localhost";
 $username="root";
 $password="";
 $dbname="myDB";



 $conn= new mysqli($servername,$username,$password,$dbname);

 if($conn->connect_error){
 	die("Error".$conn->connect_error);
 }

 
 echo "Successful   connection";


$sql="INSERT INTO STUDENT (roll_no,name,course,sem) values('1','James','MCA',1)";


if($conn->query($sql)===TRUE){
	echo "New record added";
}
else{
	echo "Something is wrong".$sql."".$conn->error;
}


$conn->close();

 ?>
 ```



4. Retrieve data using select

```php

<?php 

 $servername="localhost";
 $username="root";
 $password="";
 $dbname="myDB";



 $conn= new mysqli($servername,$username,$password,$dbname);

 if($conn->connect_error){
 	die("Error".$conn->connect_error);
 }

 
 echo "Successful   connection";




$sql="SELECT * from STUDENT";
$result=$conn->query($sql);


if($result->num_rows>0){
	while($row=$result->fetch_assoc()){
		echo"roll ".$row["roll_no"]."name".$row["name"]."course".$row["course"]."sem".$row["sem"]."<br>";
	}
  }

  else{
	echo "Nothing";
}



$conn->close();

 ?>


 ```



5. Where

```php


<?php 

 $servername="localhost";
 $username="root";
 $password="";
 $dbname="myDB";



 $conn= new mysqli($servername,$username,$password,$dbname);

 if($conn->connect_error){
 	die("Error".$conn->connect_error);
 }

 
 echo "Successful   connection";




$sql="SELECT * from STUDENT where course='MCA' ";
$result=$conn->query($sql);


if($result->num_rows>0){
	while($row=$result->fetch_assoc()){
		echo"roll ".$row["roll_no"]."name".$row["name"]."course".$row["course"]."sem".$row["sem"]."<br>";
	}
  }

  else{
	echo "Nothing";
}



$conn->close();

 ?>
```





# GET and POST with html


1. GET request to take data from a html form and redirect it to a php file


```html
<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	<form method="GET" action="getpost.php">
			<input type="text" name="name">
			<input type="email" name="email">
			<input type="submit" name="">
	</form>
</body>
</html>
```


```php
<?php

$name=$_GET['name'];
$email=$_GET['email'];

echo "name".$name;
echo "email".$email;


?>

```




2. Form validation


```php












```