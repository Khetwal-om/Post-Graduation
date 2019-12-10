
# Begin

```php
<?php
// Your code here!

echo"learn to code english";






function add($x,$y){
    return $x+$y;
}

$answer=add(12,45);
echo("$answer");


$Cars=array("one"=>"Ferrari","two"=>"Royce","three"=>"Porsche"); 



$salary[]=2000;
$salary[]=3000;
$salary[]=5000;

foreach($salary as $value){
  echo "Salary: $value<br>";
}


$Elements=array('a','b',1,22,3,4,5,666);


foreach($Elements as $element){
    echo("$element   \n");
}




$x=10;
$y=11;
$z=$x+$y;
echo ($z);

while($x<20){
    echo("hi there\n");
    $x++;
}


$choice=2;

switch($choice){
    case 1:
        echo(" hola ahi ");
        break;
    
    case 2:
        echo(" hola ahi 2 ");
        break;
    
    case 3:
        echo(" hola ahi 3 ");
        break;
}


?>

```

# Arrays

1. Indexed
2. Associative
3.  Multidimensional array



```php
<?php
// Your code here!



$oneD=array(145,34,23,54,21223,54,23);

sort($oneD);
print_r($oneD);

rsort($oneD);
print_r($oneD);

var_dump($oneD);

$cars = array(
				array("Honda Accord", "V6", 30000),
				array("Toyota Camry", "LE", 24000),
				array("Nissan Altima", "V1"),
			);

//printing array information			
print_r($cars);
echo "<br>";
var_dump($cars);







$colors = array("Red","Green","Blue");

$colors1[0] = "Red";
$colors1[1] = "Green";

$length = count($colors);
echo "colors array length=" . $length; // prints "colors array length=3"
echo "<br>";
echo "colors1 array length=" . count($colors1); // prints "colors1 array length=2"

//looping an indexed array
for($i=0; $i<$length; $i++){
	echo $colors[$i];
	echo "<br>";
}




echo " hi there".$length;























$indexed=array(1,23,34,"fsjdkl",34.35);
$associativeOne=array("one"=>"hola ahi","two"=>"vamos !!!","three"=>"adios");
$twoD=array(array(1,2,3),array(34,45,6));

foreach($indexed as $index){
    echo("$index \n");
}



echo("*******************");

for($i=0;$i<count($indexed);$i++){
    echo("$i");
}



foreach($associativeOne as $key=>$value){
    echo(" $key  =>    $value  \n");
}



asort($associativeOne);
print_r($associativeOne);







?>

```



# Form handling in php


1. 