Ext.define('relationships.model.RelationshipsModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.relationshipsModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	},{
		name : 'relationshipId',
		type : 'Long',
		sortable : true
	},{
		name : 'predicate',
		type : 'String',
		sortable : true
	},{
		name : 'synsets',
		type : 'String',
		sortable : true
	}, {
		name : 'image_id',
		type : 'Long',
		sortable : true
	},{
		name : 'object_id',
		type : 'Long',
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