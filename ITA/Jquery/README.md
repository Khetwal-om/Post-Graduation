# Jquery :   Jose Por.

1. main.html 

```html
<!DOCTYPE html>
<html>
<head>
	<title></title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">


<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>

<style type="text/css">
	.turnBlue{
		color:white;
		background: blue;
	}
	.turnTeal{
		color:teal;
		background: orange;
	}

</style>


</head>
<body>

	<h1>This is for demo</h1>


	<h3> We have to use , when changing the css
	 in one line</h3>

	 <h4> But : is used when we first store css
	 in a variable</h4>
  <li>This is li element</li>


  <form>
  	 <input type="text" name="">
  	 <input type="submit" value="submit">
  </form>


  	<script type="text/javascript" src="myscript.js"></script>
</body>
</html>
```


2. This is the js file where all jquery code goes.

```javascript
$('h1').click(function() {
	// body...
	console.log('It  ... worked');

	$('h1').html('On the fly on my plate').text();

})


$('h3').click(function() {
	// body...
	console.log('It  ... worked');

    $(this).text("I was changed");


})





$('li').click(function () {
	// body...

	console.log('any li was cliked');

})

```



3. Keypress

```javascript
$('input').eq(0).keypress(function(event){
	$('h3').toggleClass('turnBlue');
	console.log(event);

})

```

4. Change h3 on keypress if 'enter' is pressed
> 13 is it's ascii


```javascript



$('input').eq(0).keypress(function(event){


	if(event.which===13 || event.which===32){
		console.log('hola')
	$('h3').toggleClass('turnBlue');
	}
	console.log(event);

})

```



5. Animations

```js

$('input').eq(1).on('click',function(){
	$('.container').fadeOut(10);
});




$('input').eq(100).on('click',function(){
	$('.container').slideUp(10);
});


```