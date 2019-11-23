1. A new popup window

```html
<html>
<head>
	<title>Om Khetwal 34|B</title>
	<script type="text/javascript">
		function load(){
			var wind=window.open("","",height=600,width=500);
			wind.document.title="Another page";
			wind.document.body.innerHTML="<h1>This is the another one</h1>";
			var x=window.confirm("Are you sure buddy?");
			if(x){
				wind.close();
				document.write("<h1>Window is closed for the time being</h1>");
			}
		}
	</script>

</head>
<body onload="load()">
   
</body>
</html>
```

2. Program to find prime number between a given range.

```html
<!DOCTYPE html>
<html>
<head>
	<title>Khetwal om 34|B	</title>

	<!-- <script type="text/javascript">
		function isPrime() {
			var range=250;
			var j=2;
			for (var i = 2; i < 250; i++) {
					if (i%j==0){
                		document.write="hi";
                		// console.log(i);
                		j++;

					}
					else{
						document.write="hi";
						console.log(i);
						j++;
					}
				}
		}
	</script> -->




 	<script type="text/javascript">
 		function isPrime(argument) {
 			var number=119;
 			var flag=0;
 			for (var i = 2; i < number; i++) {
 				if(number%i==0){
 					flag=1;
 				}
 			}
 			if(flag==0){
 				console.log("Prime");
 			}
 			else{
 				console.log("Not a prime number");
 			}
 		}



 			function isPrimeInRange(){
 				var range=250;
 				var flag=0;
 				for(var k=2;k<250;k++){
 					for(var j=2;j<k/2;j++){
 						if(k%j==0){
 							flag=1;
 							break;
 						}
 					}
 					if(flag==0){
 						document.write(k);
 						console.log(k);
 					}
 					flag=0;
 				}
 			}
 	</script>
</head>
<body onload="isPrimeInRange()">
	<h1>Prime numbers less than 250</h1>
</body>
</html>
```


3. Count the number of vowels as well as consonants in the js script.

```html
<!DOCTYPE html>
<html>
<head>
	<title>Khetwal om 34|B	</title>	
	<meta charset="utf-8">

	<script type="text/javascript">
		function countVowelConsonant(argument) {
			var string="abcdefghijkl";
			var vowels="aeiou";
			var data=prompt("Enter something that we can process");
			var array=data.split(' ');
			console.log(array);
			console.log(array.length);
			console.log(data.length);
			var vowel=0;
			var consonant=0;
			var intermediate;

			for (var i = 0; i < data.length; i++) {
				intermediate=data.toLowerCase().charAt(i);
				console.log(intermediate); 
				if(vowels.includes(""+intermediate)){
					document.write(data.charAt(vowel));
					vowel+=1;
				}
				else if(intermediate==" "){
					
				}
				else{
					consonant+=1;
				}

 			}
 			console.log("***********************");
 			console.log(vowel);
 			console.log(consonant);

 			document.write("<h1>Vowels are  "+vowel+"</h1>");
 			document.write("<h1>Consonants are  "+consonant+"</h1>");


		}
	</script>
</head>
<body onload="countVowelConsonant()">

</body>
</html>
```


4. Styling using JS

```html
<html> 
 <head> 
  <title>Khetwal om |34</title> 
  <script> 
  function test() 
  { 
   var x=prompt("Enter your name"); 
   var data=document.getElementById("element"); 
   data.style.color="orange"; 
   data.style.fontSize="24px"; 
   data.style.background="teal"; 
   data.style.border="2px solid black";
   data.innerHTML+=" "+x; 
  } 
  </script> 
 </head> 
 <body> 
  <h1 id="element">THis is my element</h1> 
  <input type="button" value="Click" onclick="test()">  
 </body> 
</html> 



```


5. 