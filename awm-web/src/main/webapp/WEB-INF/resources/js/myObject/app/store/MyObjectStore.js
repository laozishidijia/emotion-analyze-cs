var pageSize = 20;

Ext.define('myObject.store.MyObjectStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.myObjectStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'myObject.model.MyObjectModel',
	proxy : {
		url : server_context + '/myObject/.json',
		type : 'ajax',
		api : {
			read : server_context + '/myObject/.json',
			update : server_context + '/myObject/.json'
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