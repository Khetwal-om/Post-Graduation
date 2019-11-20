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




$('input').eq(0).keypress(function(event){


	if(event.which===13 || event.which===32){
		console.log('hola')
	$('h3').toggleClass('turnBlue');
	}
	console.log(event);

})


$('li').click(function () {
	// body...

	console.log('any li was cliked');

})





$('input').eq(1).on('click',function(){
	$('.container').fadeOut(10);
});




$('input').eq(100).on('click',function(){
	$('.container').slideUp(10);
});