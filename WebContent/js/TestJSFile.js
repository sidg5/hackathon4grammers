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
				   init();
			   },
			   type: 'GET'
			});
	
	 });
	  var truckID =$('#truckid').val();
	  //alert("truckID:"+truckID);
	 $('#tankFill').click(function (event) {
		
		 $.ajax({
			   url: 'http://localhost:8080/hackathon4grammers/rest/waterDispensing/request',
			   data: {
			      format: 'json',
			      'truckid': truckID
			   },
			   success: function(data) {
				   //alert("success");
			   },
			   type: 'POST'
			});
	
	 });
});