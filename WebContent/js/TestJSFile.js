/**
 * 
 */$(document).ready(function () {
	 
	 $('#sampleButtom').click(function (event) {
	 
		 $.ajax({
			   url: 'http://localhost:8080/PlantWateringSystem/rest/message',
			   data: {
			      format: 'json'
			   },
			   success: function(data) {
				   alert("success");
				   alert(data);
			   },
			   type: 'GET'
			});
	
	 });
});