Ext.define('relationships.store.RelationshipsStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.relationshipsStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'relationships.model.RelationshipsModel',
	proxy : {
		url : server_context + '/relationships/.json',
		type : 'ajax',
		api : {
			read : server_context + '/relationships/.json',
			update : server_context + '/relationships/.json'
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