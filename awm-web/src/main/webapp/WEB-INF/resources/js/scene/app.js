Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'scene',
	appFolder : server_context + '/resources/js/scene/app',
	controllers : [ 'SceneController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'sceneGrid'
			} ]
		});
	}
});
