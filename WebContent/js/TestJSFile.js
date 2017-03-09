/**
 * 
 */$(document).ready(function () {
	 
	 $('#sampleButtom').click(function (event) {
	 
		 $.ajax({
			   url: 'http://localhost:8080/hackathon4grammers/rest/message',
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
	 
	 $('#tankFill').click(function (event) {
		 
		 $.ajax({
			   url: 'http://localhost:8080/hackathon4grammers/rest/waterDispensing/request',
			   data: {
			      format: 'json'
			   },
			   success: function(data) {
				   alert("success");
				   alert(data);
			   },
			   type: 'POST'
			});
	
	 });
});