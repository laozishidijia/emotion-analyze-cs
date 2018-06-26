Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'myObject',
	appFolder : server_context + '/resources/js/myObject/app',
	controllers : [ 'MyObjectController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'myObjectGrid'
			} ]
		});
	}
});
