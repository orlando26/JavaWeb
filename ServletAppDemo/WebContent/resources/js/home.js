$(document).ready(function(){
	
	$( "#update-dialog" ).dialog({
	      autoOpen: false,
	      show: {
	        effect: "fade",
	        duration: 200
	      },
	      hide: {
	        effect: "fade",
	        duration: 200
	      }
	    });
});

function deleteUser(id){
	console.log('delete user' + id);
	$.get('/ServletAppDemo/HomeServlet',{
		userId : id
	}, function(response){
		location.reload();
	});
}

function updateUser(id){
	$('#inputId').val(id);
	var btn = $('#updateBtn').text();
	$.get('/ServletAppDemo/HomeServlet',{
		btnText : btn,
		userId : id
	}, function(response){
		location.reload();
	});
	$( "#update-dialog" ).dialog( "open" );
}