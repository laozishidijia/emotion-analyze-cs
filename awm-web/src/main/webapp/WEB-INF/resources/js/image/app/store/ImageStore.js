var pageSize = 20;

Ext.define('image.store.ImageStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.imageStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'image.model.ImageModel',
	proxy : {
		url : server_context + '/image/.json',
		type : 'ajax',
		api : {
			read : server_context + '/image/.json',
			update : server_context + '/image/.json'
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