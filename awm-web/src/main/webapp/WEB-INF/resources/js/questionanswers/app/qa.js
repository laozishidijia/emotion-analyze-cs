function getqaDataBy(id) {
		
Ext.define('questionanswers.model.QuestionanswersModel',{
	extend : 'Ext.data.Model',
	alias : 'widget.questionanswersModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'image_id',
		type : 'Long',
		sortable : true
	}, {
		name : 'qa_id',
		type : 'Long',
		sortable : true
	}, {
		name : 'question',
		type : 'String',
		sortable : true
	}, {
		name : 'answer',
		type : 'String',
		sortable : true
	}, {
		name : 'a_objects',
		type : 'String',
		sortable : true
	}, {
		name : 'q_objects',
		type : 'String',
		sortable : true
	}, {
		name : 'dateCreated',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	}, {
		name : 'dateModified',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	} ]
});
var qaJsonDataGet = Ext.util.JSON.decode(server_context + '/questionanswers/image/' + id + '.json');
Ext.define('questionanswers.store.QuestionanswersStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.questionanswersStore',
	model : 'questionanswers.model.QuestionanswersModel',
	autoLoad : true,
	proxy : {
		url : qaJsonDataGet,
		type : 'ajax',
		contentType: 'application/json;charset=UTF-8',
		reader : {
			type : 'json',
			successProperty : 'success'
		}
	}
});
var qaStore = Ext.create('questionanswers.store.QuestionanswersStore');
qaStore.load({
	callback : function(records, operation, successful) {
		if(successful){
		console.log(records[0]);
		}else{
			console.log("read qalist error!")
		}
	}
});
}
