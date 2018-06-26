Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'relationships',
	appFolder : server_context + '/resources/js/relationships/app',
	controllers : [ 'RelationshipsController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'relationshipsGrid'
			} ]
		});
	}
});
