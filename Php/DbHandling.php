<?php


$servername="localhost";
$username="root";
$password="";


$conn=new mysqli($servername,$username,$password);

if($conn->connect_error){
	die("error".$conn->connect_error);
}

echo "Connection established";

$sql="CREATE DATABASE myBD";

if($conn->query($sql)===TRUE){
   echo "Database is created";
}
echo "error in creating db";






$sql="CREATE TABLE STUDENT (
   name varchar(20),
   age int(6),
   roll int(6) primary key)";


if($conn->query($sql)===TRUE){
	echo "one row is created ";
}
echo "error is creating row";


$sql="insert into STUDENT (name,age,roll) values('john',23,1)";
if($conn->query($sql)===TRUE){
	echo "one row is created ";
}

$sql="select * from STUDENT";
$result=$conn->query($sql);


if($result->num_rows>0){

while($row=result->fetch_assoc()){
	echo "string".$row['name']"".$row['age']."  ".$row['roll'];
}

}





$conn->close();

?>