Ext.define('questionanswers.model.QuestionanswersModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.questionanswersModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	},{
		name : 'image_id',
		type : 'Long',
		sortable : true
	},{
		name : 'qa_id',
		type : 'Long',
		sortable : true
	},{
		name : 'question',
		type : 'String',
		sortable : true
	},{
		name : 'answer',
		type : 'String',
		sortable : true
	},{
		name : 'a_objects',
		type : 'String',
		sortable : true
	},{
		name : 'q_objects',
		type : 'String',
		sortable : true
	},{
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