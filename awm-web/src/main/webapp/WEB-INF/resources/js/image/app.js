Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'image',
	appFolder : server_context + '/resources/js/image/app',
	controllers : [ 'ImageController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'imageGrid'
			} ]
		});
	}
});
