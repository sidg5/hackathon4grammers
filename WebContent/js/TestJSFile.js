/**
 * 
 */$(document).ready(function () {
	 var rootURL = "http://localhost:8080/hackathon4grammers/rest/wines/post";
	 $('#sampleButton').click(function (event) {
	 
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
	 
	//var xyz = jQuery.url.param("truckId");
	  //var truckID =$('#truckid').val();
	 // alert("xyz: "+xyz);
	 $('#tankFill').click(function (event) {
		
		 $.ajax({
			   url: 'http://localhost:8080/hackathon4grammers/restful/waterDispensing/request',
			   data: {
			      format: 'json',
			     // 'truckid': truckID
			   },
			   success: function(data) {
				   //alert("success");
			   },
			   type: 'POST'
			});
	
	 });
	 
	 
	
	 $('#loginReq').click(function (event) {
		
		 var userid =$('#userid').val();
		 var password =$('#password').val();
		 var userRole =$('#userRole').val();
		 
		 $.ajax({
			   url: 'http://localhost:8080/hackathon4grammers/restful/userLogin/request',
			   data: {
			      format: 'json',
			      'userid': userid,
			      'password': password,
			      'userRole': userRole
			   },
			   success: function(data) {
				   window.location.href = "pages/RemoteClientLogin.html?truckId="+data;
			   },
			   error: function(data) {
				   alert("faliure");
			   },
			   type: 'POST'
			});
	
	 });
});