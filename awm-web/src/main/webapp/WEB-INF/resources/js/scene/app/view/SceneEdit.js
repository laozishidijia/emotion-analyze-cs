Ext.define('scene.view.SceneEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.sceneEdit',
	title : '编辑景象信息',
	layout : 'fit',
	autoShow : true,
	initComponent : function() {
		this.items = [ {
			xtype : 'form',
			height : 300,
			width : 300,
			border : false,
			items : [{
				xtype : 'textfield',
				name : 'imageId',
				fieldLabel : 'IMAGEID'
			}, {
				xtype : 'textfield',
				name : 'relationshipsId',
				fieldLabel : 'RELATIONSHIPSID'
			}, {
				xtype : 'textfield',
				name : 'objectsId',
				fieldLabel : 'OBJECTSID'
			}
			]
		} ];
		this.buttons = [ {
			text : '保存',
			action : 'save'
		}, {
			text : '取消',
			scope : this,
			handler : this.close
		} ];
		this.callParent(arguments);
	}
});
