Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'questionanswers',
	appFolder : server_context + '/resources/js/questionanswers/app',
	controllers : [ 'QuestionanswersController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'questionanswersGrid'
			} ]
		});
	}
});
