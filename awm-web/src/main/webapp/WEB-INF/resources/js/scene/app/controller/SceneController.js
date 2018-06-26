Ext.define('scene.controller.SceneController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.sceneController',
	stores : [ 'SceneStore' ],
	models : [ 'SceneModel' ],
	views : [ 'SceneGrid', 'SceneEdit' ],
	init : function() {
		this.control({
			'sceneGrid' : {
				itemdblclick : this.editScene
			},
			'sceneEdit button[action=save]' : {
				click : this.updateScene
			}
		});
	},
	editScene : function(grid, record) {
		var view = Ext.widget('sceneEdit');
		view.down('form').loadRecord(record);
	},
	updateScene : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
