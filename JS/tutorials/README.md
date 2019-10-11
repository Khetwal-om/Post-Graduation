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
for malicious purposes. (Securit issues).


* Types

1. Client side scripts(where browser is installed): The script which is running
within the browser.
> Js\
jquery\
angular\
ember

2. Server side scripts : The script whichis running within the web server .

> asp IIS(internet information services)\
jsm tomcat/sun java system web server\
php  apache\
w3c jigsaw



* Difference between scripting | programming languages

1. interpreted based.
2. implicit declaration of data type.
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