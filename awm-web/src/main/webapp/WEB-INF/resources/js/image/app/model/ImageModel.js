Ext.define('image.model.ImageModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.imageModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	},{
		name : 'image_id',
		type : 'int',
		sortable : true
	},  {
		name : 'url',
		type : 'string',
		sortable : true
	}, {
		name : 'height',
		type : 'int',
		sortable : true
	}, {
		name : 'width',
		type : 'int',
		sortable : true
	}, {
		name : 'coco_id',
		type : 'int',
		sortable : true
	}, {
		name : 'flickr_id',
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