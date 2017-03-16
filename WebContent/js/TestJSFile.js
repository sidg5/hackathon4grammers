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
		 var query = findGetParameter('truckId');
		 alert("query: "+query);
		 $.ajax({
			   url: 'http://localhost:8080/hackathon4grammers/rest/waterdispensing/request',
			   data: {
			      format: 'json',
			      'truckid': query
			   },
			   success: function(data) {
				   //alert("success");
			   },
			   type: 'POST'
			});
	
	 });
	 
	 function findGetParameter(parameterName) {
		    var result = null,
		        tmp = [];
		    var items = location.search.substr(1).split("&");
		    for (var index = 0; index < items.length; index++) {
		        tmp = items[index].split("=");
		        if (tmp[0] === parameterName) result = decodeURIComponent(tmp[1]);
		    }
		    return result;
		}
	
	 $('#loginReq').click(function (event) {
		
		 var userid =$('#userid').val();
		 var password =$('#password').val();
		 var userRole =$('#userRole').val();
		 
		 $.ajax({
			   url: 'http://localhost:8080/hackathon4grammers/rest/userLogin/request',
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