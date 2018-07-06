window.onload=function () {
	var question = window.document.getElementById("question");
	var image = window.document.getElementById("image");
	var region = window.document.getElementById("region");
	var object = window.document.getElementById("object");
	 if(image){
		  var image_content="";
		  for(var i=141315;i<=141321;i++ ){
       $.ajax({
           type: "get",
           dataType: "json",
           url: server_context + '/image/'+i+'.json',
           success: function (msg) {
        	   image_content += "<tr>" +
                       "<td>" + msg.id + "</td>" +
                       "<td>" + msg.image_id + "</td>" +
                       "<td>" + msg.height + "</td>" +
                       "<td>" + msg.width + "</td>" +
                       "<td>" + msg.url + "</td>" +
                       "</tr>";
        	   image.innerHTML=image_content;
           }
       
       });
		  }
	  }else{
			  error: function error () {
	              alert("没有image节点");
		  }
	  }
	 
	  if(question){
		  var question_content="";
		  for(var i=80610;i<=80616;i++ ){
        $.ajax({
            type: "get",
            dataType: "json",
            url: server_context + '/questionanswers/'+i+'.json',
            success: function (msg) {
            			question_content += "<tr>" +
                        "<td>" + msg.id + "</td>" +
                        "<td>" + msg.image_id + "</td>" +
                        "<td>" + msg.question + "</td>" +
                        "<td>" + msg.answer + "</td>" +
                        "</tr>";
                    	question.innerHTML=question_content;
            }
        
        });
		  }
	  }else{
			  error: function error () {
	              alert("没有question节点");
		  }
	  }
	  
	  if(region){
		  var region_content="";
		  for(var i=80486;i<=80491;i++){
        $.ajax({
            type: "get",
            dataType: "json",
            url: server_context + '/region/'+i+'.json',
            success: function (msg) {
            			region_content += "<tr>" +
                        "<td>" + msg.region_id + "</td>" +
                        "<td>" + msg.phrase + "</td>" +
                        "<td>" + msg.width + "</td>" +
                        "<td>" + msg.x + "</td>" +
                        "<td>" + msg.y + "</td>" +
                        "</tr>";
            			region.innerHTML=region_content;
            }
        });
		  }
	  }else{
			  error: function error () {
	              alert("没有region节点");
		  }
	  }
	  
	  if(object){
		  var object_content="";
		  for(var i=2848001;i<=2848011;i+=2){
        $.ajax({
            type: "get",
            dataType: "json",
            url: server_context + '/myObject/'+i+'.json',
            success: function (msg) {
            	object_content += "<tr>" +
                        "<td>" + msg.image_id + "</td>" +
                        "<td>" + msg.names + "</td>" +
                        "<td>" + msg.w + "</td>" +
                        "<td>" + msg.x + "</td>" +
                        "<td>" + msg.y + "</td>" +
                        "</tr>";
            	object.innerHTML=object_content;
            }
        });
		  }
	  }else{
			  error: function error () {
	              alert("没有object节点");
		  }
	  }
	  
	  
	  
}
