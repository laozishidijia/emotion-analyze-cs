var pageSize = 20;
Ext.define('questionanswers.store.QuestionanswersStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.questionanswersStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'questionanswers.model.QuestionanswersModel',
	proxy : {
		url : server_context + '/questionanswers/.json',
		type : 'ajax',
		api : {
			read : server_context + '/questionanswers/.json',
			update : server_context + '/questionanswers/.json'
		},
		reader : {
			type : 'json',
			root : 'content',
			totalProperty : 'totalElements'
		},
		writer : {
			type : 'json'
		}
	},
	// 每页显示的记录行数
	pageSize : pageSize
});