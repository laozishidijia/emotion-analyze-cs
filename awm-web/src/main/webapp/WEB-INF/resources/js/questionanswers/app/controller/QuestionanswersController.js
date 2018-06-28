Ext.define('questionanswers.controller.QuestionanswersController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.questionanswersController',
	stores : [ 'QuestionanswersStore' ],
	models : [ 'QuestionanswersModel' ],
	views : [ 'QuestionanswersGrid', 'QuestionanswersEdit' ],
	init : function() {
		this.control({
			'questionanswersGrid' : {
				itemdblclick : this.editQuestionanswers
			},
			'questionanswersEdit button[action=save]' : {
				click : this.updateQuestionanswers
			}
		});
	},
	editQuestionanswers : function(grid, record) {
		var view = Ext.widget('questionanswersEdit');
		view.down('form').loadRecord(record);
	},
	updateQuestionanswers : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
