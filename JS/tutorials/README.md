# 1 Introduction


---

__Script is simple weakly typed programming__


### Pros

1. Easy to learn and use, minimum programming knowledge or experience required.
2. Allow complex task to be performed in relatively few steps.
3. Allow simple creation and editing in a variety of text editors.
4. Allow the addition of dynamic interactive activities to web pages.
5. Editing and running code is fast.


### Cons

1. Because of code executes on the users computer,in some cases it can be exploited
for malicious purposes. (Security issues).


* Types

1. Client side scripts(where browser is installed): The script which is running
within the browser.
> Js\
jquery\
angular\
ember

2. Server side scripts : The script which is running within the web server .

> asp IIS(internet information services)\
jsm tomcat/sun java system web server\
php  apache\
w3c jigsaw



* Difference between scripting | programming languages

1. interpreted based.
2. implicit declaration of data type. *dynamic* i.e **Dynamically typed language**
3. limited support for application development.
4. limited support for graphics design.
5. easily integrated with other tech.




---


# Lecture 2


---


1. Js is lightweight programming language interpreted by browser engine when
web page is loaded.
js is scripting lang of html and web.

2. Created by __Brendon Eich__  at netscape . Firstly in 1995 (livescript).
3. js official name ECMAScript (European computer manufacturer's Association)
international org.


#### Features


1. responsive web page
2. create cookies
3. validate
4. support for objects



---


>Document is the object.\
write() is the method.\
"welcome" is what we want to display on the web 
page

```html

<!DOCTYPE html>
<html>
<head>
	<title>	</title>
	<script type="text/javascript">
		document.write("welcome");
	</script>
</head>
<body>

</body>
</html>

```


```html

<!DOCTYPE html>
<html>
<head>
	<title>	</title>
	<pre>
	<script type="text/javascript">
		document.write("welcome");
		document.write('welcome');
	</script>
</pre>
</head>
<body>

</body>
</html>

```


```html

<!DOCTYPE html>
<html>
<head>
	<title>	</title>
	
	<script type="text/javascript">
		document.write("welcome");
		document.write('<br/>');

		document.write('<h1 style="color: red">Within JS</h1>');
		document.write('welcome');
	</script>
</pre>
</head>
<body>

</body>
</html>
```


# Lecture 3 JS   statement,semicolons,comments


1. window is __web browser__ document is __web page__.

> writeln place a space.\
once used with __pre__ , **writeln** place a new line.

```html
<!DOCTYPE html>
<html>
<head>
	<title>	</title>
	
	<script type="text/javascript">
		window.document.write("Window Object");
		document.write('<br/>');
		document.write("document object");

	</script>

</head>
<body>

</body>
</html>
```


2. JS popup boxes

 1. Alert Box
 2. Confirm Box
 3. Prompt Box


```html

<!DOCTYPE html>
<html>
<head>
	<title>	</title>
	
	<script type="text/javascript">

		document.write("document object");

		alert("Hey ecma \n this is new line");
		var result=confirm("You sure");
		alert("user clicked on"+result);


		var name=prompt("Enter your name","Joey");
		alert("user Entered"+name);
	</script>

</head>
<body>

</body>
</html>
```





# Lecture 5 JS in our HTML file


1. Internal :Head section (logical part)
2. External 
3. Body    (visual)



```html
<!DOCTYPE html>
<html>
<head>
	<title>	</title>
	
	<script type="text/javascript" src="My.js">

	</script>

</head>
<body>	
	utempor incididunt ut labore et dolore magna 
</body>
</html>
```

```javascript
document.write("<h1 style='color:teal;'>My external js file</h1>")
```



# Lecture 6 Variables in JS

1. primitive
2. non-primitive


>primitive\
number\
string \
boolean \
null\
undefined

__non-primitive :Object (reference data type)__



```javascript
var x=20;
document.write(x+'<br>');
var pi=30.33;
document.write(pi+'<br>');
var s="x is dynamic in nature";
document.write(s+"<br>");


document.write("My boolean value is "+(100>23)+"<br>");

var z;
document.write(z+"<br>");


var a=null;
document.write(a);
```


---

__Escape sequence within JS file__

```javascript
document.write("Java fifth  \"khalid\" edition");
```

---


# noscript , JS operators

---

1. The <noscript></noscript> tag is used to provide an alternate content for users that have disabled scripts in their browser or have a browser that doesn't support client-side scripting.
The <noscript></noscript> element can contain all the elements that you can find inside the <body>
element of a normal HTML page. The content inside the <noscript></noscript> will only be displayed if scripts are not supported, or are disabled in the user's browser.



```html
<!DOCTYPE html>
<html>
<head>
	<title>JS	</title>
	
<script type="text/javascript" src="My.js"></script>
</head>
<body>	
	<p>
	utempor incididunt ut labore et dolore magna 
	</p>

	<noscript>
		<p style="color: teal">This is the noscript part</p>
	</noscript>
</body>
</html>
```

---



# Lecture 8  Conditional compilation


1. If else

```js
<!DOCTYPE html>
<html>
<head>
	<title>Conditional Compilation</title>
	<script type="text/javascript">
		var x=prompt("Enter the number ","5"); //default number is 5

		if(x>100)
		{
			alert("user entered"+x);
		}
		else{
		 document.write("user entered"+x);
		}

	</script>
</head>
<body>

</body>
</html>
```


2. Switch

> prompt deals with string.

```js
<!DOCTYPE html>
<html>
<head>
	<title>Conditional Compilation</title>
	<script type="text/javascript">
		var choice=prompt("Enter the number "); //default number is 5
		document.write(typeof(choice));
		var answer=choice*10;
		document.write(typeof(answer));
		switch(choice)
		{
			case '1':
			document.write("Case 1");
			break;

			case '2':
			document.write("Case 2");
			break;


			case '3':
			document.write("Case 3");
			break;

			default:
			document.write("Good grief we have to use only 10 pages");


		}

	</script>
</head>
<body>

</body>
</html>


```

---


stringnumberCase 3


---


# Lecture 9 loops

---

1. The for loop

```js
<!DOCTYPE html>
<html>
<head>
	<title></title>
	<script>
			for(i=1;i<=6;i++)
			{
				document.write("<h"+i+">"+"hola"+"</h>");
			}
 
	</script>
</head>
<body>

</body>
</html>
```


2. Do while

```js
<!DOCTYPE html>
<html>
<head>
	<title></title>

	<script>
			
			i=1;
		do
		{
			document.write("The number is"+i);
			document.write("<hr>");
			i++;
		}

		while(i<=10)document.write("within while updation"+"<br>");
		
 
	</script>
</head>
<body>

</body>
</html>
```

---



# Lecture  10 Function


```js
<!DOCTYPE html>
<html>
<head>
	<title></title>

	<script type="text/javascript">
			
			function Teal() {			

			    document.bgColor="teal";

			}
			function Red() {			

			    document.bgColor="Red";
			}


			function Orange() {			

			    document.bgColor="Orange";
			}


	</script>
</head>
<body>

<BUTTON onClick="Teal()">Teal</BUTTON>
<BUTTON onClick="Red()">Red</BUTTON>
<BUTTON onClick="Orange()">Orange</BUTTON>



</body>
</html>

```


# Lecture 11 Events in JS



1. *innerHTML* simply removes everything that particular id displays.
This is for the container.




```js
<!DOCTYPE html>
<html>
<head>
	<title></title>

	<script>
			
			function Sms() {
				document.getElementById('one').innerHTML=Date();
			}


			function Two() {
				document.getElementById("two").innerHTML=Date();
			}

	</script>
</head>
<body>

 <h1 id='one'>Inner HTML</h1>

 <p id="two">adipisicing elit, sed do eiusmod
 tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
 </p>
 <BUTTON onClick="Sms()">Click</BUTTON>
 <BUTTON onClick="Two()">Click</BUTTON>

</body>
</html>



```


2. Ondblclick() 

```html
<BUTTON onClick="Sms()">Click</BUTTON>
<BUTTON ondblclick="Two()">Click</BUTTON>
```


3. onload():


```javascript


<!DOCTYPE html>
<html>
<head>
	<title></title>

	<script>
			
			function PageLoad() {
				document.bgColor="teal";
			}

	</script>
</head>
<body onload="PageLoad()">


<h1>Homie</h1>
</body>
</html>
```





# 15  Errors in JS

1. Syntax
2. Runtime
3. Logical

16211281
pagajjmpwjackey

16211047
kaboom

