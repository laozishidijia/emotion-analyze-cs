Ext.define('scene.model.SceneModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.sceneModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'imageId',
		type : 'Long',
		sortable : true
	},{
		name : 'relationshipsId',
		type : 'string',
		sortable : true
	}, {
		name : 'objectsId',
		type : 'string',
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