Ext.define('myObject.model.MyObjectModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.myObjectModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'h',
		type : 'int',
		sortable : true
	},{
		name : 'merged_object_ids',
		type : 'string',
		sortable : true
	}, {
		name : 'names',
		type : 'string',
		sortable : true
	}, {
		name : 'object_id',
		type : '                                                                                                                                                                                                                                                     ',
		sortable : true
	}, {
		name : 'synsets',
		type : 'string',
		sortable : true
	}, {
		name : 'w',
		type : 'int',
		sortable : true
	}, {
		name : 'x',
		type : 'int',
		sortable : true
	}, {
		name : 'y',
		type : 'int',
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