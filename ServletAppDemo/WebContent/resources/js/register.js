$(document).ready(function(){
	
	$('#states_select').change(function(){
		var state = $(this).val();
		console.log(state);
		cityDropdown(state)
		
	});
	
	
});

function cityDropdown(id){
	$.get('/ServletAppDemo/GetCitiesServlet', {
		stateId : id
	}, function(citiesArr){
		document.getElementById("cities_select").options.length = 0;
		console.log(citiesArr);
		$.each(citiesArr, function(key, value){
			$('#cities_select').append($("<option/>",{
				value: key,
				text: value.name
			}));
		});
	});
}