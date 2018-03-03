$(document).ready(function(){
	
	$('.btn').click(function(){
		var btnText = $(this).text();
		console.log(btnText);
		
		$.get('/ServletAppDemo/AjaxServlet',{
			button: btnText
		});
	});
	
	
});