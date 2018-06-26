Ext.define('relationships.controller.RelationshipsController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.relationshipsController',
	stores : [ 'RelationshipsStore' ],
	models : [ 'RelationshipsModel' ],
	views : [ 'RelationshipsGrid', 'RelationshipsEdit' ],
	init : function() {
		this.control({
			'relationshipsGrid' : {
				itemdblclick : this.editRelationships
			},
			'relationshipsEdit button[action=save]' : {
				click : this.updateRelationships
			}
		});
	},
	editRelationships : function(grid, record) {
		var view = Ext.widget('relationshipsEdit');
		view.down('form').loadRecord(record);
	},
	updateRelationships : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
