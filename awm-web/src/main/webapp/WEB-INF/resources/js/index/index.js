function getquestion(imageId) {
	// 对应图片的问答数据
	var question_content = "";
	var question =document.getElementById("questionTable");
		$.ajax({
			type : "get",
			dataType : "json",
			url : server_context + '/questionanswers/image/' + imageId+'.json',		
			success : function(msg) {
				console.log(msg);
				for(var i=0;i<6;i++)
					{
					question_content+="<tr>"
						+"<td>" + msg[i].question + "</td>"
						+ "<td>" + msg[i].answer + "</td>" +
						"</tr>";
					question.innerHTML = question_content;
					}
			}
		});
}