Ext.define('image.controller.ImageController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.imageController',
	stores : [ 'ImageStore' ],
	models : [ 'ImageModel' ],
	views : [ 'ImageGrid', 'ImageEdit' ],
	init : function() {
		this.control({
			'imageGrid' : {
				itemdblclick : this.editImage
			},
			'imageEdit button[action=save]' : {
				click : this.updateImage
			}
		});
	},
	editImage : function(grid, record) {
		var view = Ext.widget('imageEdit');
		view.down('form').loadRecord(record);
	},
	updateImage : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
