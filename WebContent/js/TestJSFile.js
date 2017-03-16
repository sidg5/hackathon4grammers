/**
 * 
 */$(document).ready(function () {
	 var rootURL = "http://localhost:8080/hackathon4grammers/rest/wines/post";
	 $('#sampleButtom').click(function (event) {
	 
		 $.ajax({
				type: 'POST',
				contentType: 'application/json',
				url: rootURL,
				dataType: "json",
				data: formToJSON(),
				success: function(data, textStatus, jqXHR){
					alert(data.id);
				},
				error: function(jqXHR, textStatus, errorThrown){
					alert('addWine error: ' + textStatus);
				}
			});
		/* $.ajax({
			   url: 'http://localhost:8080/PlantWateringSystem/rest/message',
			   data: {
			      format: 'json'
			   },
			   success: function(data) {
				   alert("success");
				   alert(data);
			   },
			   type: 'GET'
			});*/
	
	 });
	 
	 function formToJSON() {
		return JSON.stringify({
				"id":"1", 
				"name":"3"
				});
		}
});