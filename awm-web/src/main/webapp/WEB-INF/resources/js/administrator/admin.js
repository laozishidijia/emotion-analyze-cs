window.onload=function () {
	var question = window.document.getElementById("question");
	
	  if(question){
		  var question_content="";
		  for(var i=80610;i<=80616;i++ ){
        $.ajax({
            type: "get",
            dataType: "json",
            
            url: server_context + '/questionanswers/'+i+'.json',
            success: function (msg) {
            			console.log(msg.id);
            			console.log(msg.image_id);
            			console.log(msg.question);
            			console.log(msg.answer);
            			question_content += "<tr>" +
                        "<td>" + msg.id + "</td>" +
                        "<td>" + msg.image_id + "</td>" +
                        "<td>" + msg.question + "</td>" +
                        "<td>" + msg.answer + "</td>" +
                        "</tr>";
                    	question.innerHTML=question_content;
            },
        	failure:function(){
        		continue;
        	}
        
        });
		  }
	  }else{
		  error: function error () {
              alert("没有找到节点");
	  }
	  }
}
