Ext.define('scene.store.SceneStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.sceneStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'scene.model.SceneModel',
	proxy : {
		url : server_context + '/scene/.json',
		type : 'ajax',
		api : {
			read : server_context + '/scene/.json',
			update : server_context + '/scene/.json'
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