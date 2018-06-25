Ext.define('myObject.controller.MyObjectController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.myObjectController',
	stores : [ 'MyObjectStore' ],
	models : [ 'MyObjectModel' ],
	views : [ 'MyObjectGrid', 'MyObjectEdit' ],
	init : function() {
		this.control({
			'myObjectGrid' : {
				itemdblclick : this.editMyObject
			},
			'myObjectEdit button[action=save]' : {
				click : this.updateMyObject
			}
		});
	},
	editMyObject : function(grid, record) {
		var view = Ext.widget('myObjectEdit');
		view.down('form').loadRecord(record);
	},
	updateMyObject : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
